package net.mooctest;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.junit.Test;

public class ACOTest {

  @Test(timeout=400)
  public void test(){
      ArrayList<String[]> arrayList0 = new ArrayList<String[]>();
      ACO aCO0 = new ACO(arrayList0, 0, 0, 0.0, 0, 0);
      
      ArrayList<String[]> arrayList1 = new ArrayList<String[]>();
      arrayList1.add(new String[] {"#"});
      arrayList1.add(new String[] {"1"});
      arrayList1.add(new String[] {"2"});
      arrayList1.add(new String[] {"3"});
      arrayList1.add(new String[] {"#"});
      arrayList1.add(new String[] {"1","2","5"});
      arrayList1.add(new String[] {"1","3","4"});
      arrayList1.add(new String[] {"2","3","7"});
      ACO aCO1 = new ACO(arrayList1, 50, 1, 5, 0.5, 200);
      origACO oACO1 = new origACO(arrayList1, 50, 1, 5, 0.5, 200);
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);

        // ִ����Ⱥ�㷨
        aCO1.antStartSearching(100);

        // �ָ�ԭʼ��System.out
        System.setOut(System.out);

        // ��ȡ��������
        String actualOutput = baos.toString();
        aCO1.antStartSearching(100);
      //String expectedOutput = "����100��ѭ�����������յó������·����\r\nentrance-->1-->2-->3-->1"
      //assert actualOutput.equals(expectedOutput) : "ʵ�������Ԥ���������";
      //double[][] pheromoneMatrix = {
        //{-1,-1,-1,0},
        //{-1,-1,-1,0},
        //{-1,-1,-1,0},
        //{0,0,0,0}
      //};
      //ArrayList<String> nonVisitedCitys = new ArrayList<String>();
      //nonVisitedCitys.add("1");
      //nonVisitedCitys.add("2");
      //nonVisitedCitys.add("3");
      //Ant ant0 = new Ant(pheromoneMatrix, nonVisitedCitys);
      //System.out.println(aCO1.selectAntNextCity(ant0, 1).toString());
      // assertEquals(aCO1.selectAntNextCity(ant0, 0));
      String result = oACO1.antStartSearching(100);
      assert actualOutput.equals(result);
      ArrayList<String[]> arrayList2 = new ArrayList<String[]>();
      arrayList2.add(new String[] {"#"});
      arrayList2.add(new String[] {"#"});
      ACO aCO2 = new ACO(arrayList2, 0, 0, 0.0, 0, 0);
  }
}

class origACO {
	// ������������
	public static final int INPUT_CITY_NAME = 1;
	public static final int INPUT_CITY_DIS = 2;

	// ���м�����ڽӾ���
	public static double[][] disMatrix;
	// ��ǰʱ��
	public static int currentTime;

	// �������ݵ�ַ
	private String filePath;
	// ��������
	private int antNum;
	// ���Ʋ���
	private double alpha;
	private double beita;
	private double p;
	private double Q;
	// �����������
	private Random random;
	// �������Ƽ���,����Ϊ�˷��㣬�����������ֱ�ʾ
	private ArrayList<String> totalCitys;
	// ���е����ϼ���
	private ArrayList<Ant> totalAnts;
	// ���м����Ϣ��Ũ�Ⱦ�������ʱ������������
	private double[][] pheromoneMatrix;
	// Ŀ������·��,˳��Ϊ�Ӽ��ϵ�ǰ������Ų��
	private ArrayList<String> bestPath;
	// ��Ϣ�ؾ���洢ͼ,key���õĸ�ʽ(i,j,t)->value
	private Map<String, Double> pheromoneTimeMap;

	public origACO(ArrayList<String[]> dataArray, int antNum, double alpha, double beita,
			double p, double Q) {
		this.antNum = antNum;
		this.alpha = alpha;
		this.beita = beita;
		this.p = p;
		this.Q = Q;
		this.currentTime = 0;

		readDataFile(dataArray);
	}

	/**
	 * ��ȡ����
	 */
	private void readDataFile(ArrayList<String[]> dataArray) {

		int flag = -1;
		int src = 0;
		int des = 0;
		int size = 0;
		// ���г�������������ͳ��
		this.totalCitys = new ArrayList<String>();
		for (String[] array : dataArray) {
			if (array[0].equals("#") && totalCitys.size() == 0) {
				flag = INPUT_CITY_NAME;

				continue;
			} else if (array[0].equals("#") && totalCitys.size() > 0) {
				size = totalCitys.size();
				// ��ʼ���������
				this.disMatrix = new double[size + 1][size + 1];
				this.pheromoneMatrix = new double[size + 1][size + 1];

				// ��ʼֵ-1����˶�Ӧλ����ֵ
				for (int i = 0; i < size; i++) {
					for (int j = 0; j < size; j++) {
						this.disMatrix[i][j] = -1;
						this.pheromoneMatrix[i][j] = -1;
					}
				}

				flag = INPUT_CITY_DIS;
				continue;
			}

			if (flag == INPUT_CITY_NAME) {
				this.totalCitys.add(array[0]);
			} else {
				src = Integer.parseInt(array[0]);
				des = Integer.parseInt(array[1]);

				this.disMatrix[src][des] = Double.parseDouble(array[2]);
				this.disMatrix[des][src] = Double.parseDouble(array[2]);
			}
		}
	}

	/**
	 * ��������ϳ���i��j�ĸ���
	 * 
	 * @param cityI
	 *            ����I
	 * @param cityJ
	 *            ����J
	 * @param currentTime
	 *            ��ǰʱ��
	 * @return
	 */
	private double calIToJProbably(String cityI, String cityJ, int currentTime) {
		double pro = 0;
		double n = 0;
		double pheromone;
		int i;
		int j;

		i = Integer.parseInt(cityI);
		j = Integer.parseInt(cityJ);

		pheromone = getPheromone(currentTime, cityI, cityJ);
		n = 1.0 / disMatrix[i][j];

		if (pheromone == 0) {
			pheromone = 1;
		}

		pro = Math.pow(n, alpha) * Math.pow(pheromone, beita);

		return pro;
	}

	/**
	 * �����ۺϸ������ϴ�I�����ߵ�J���еĸ���
	 * 
	 * @return
	 */
	public String selectAntNextCity(Ant ant, int currentTime) {
		double randomNum;
		double tempPro;
		// �ܸ���ָ��
		double proTotal;
		String nextCity = null;
		ArrayList<String> allowedCitys;
		// �����и��ʼ�
		double[] proArray;

		// ����Ǹոտ�ʼ��ʱ��û��·���κγ��У����������һ������
		if (ant.currentPath.size() == 0) {
			nextCity = String.valueOf(random.nextInt(totalCitys.size()) + 1);

			return nextCity;
		} else if (ant.nonVisitedCitys.isEmpty()) {
			// ���ȫ��������ϣ����ٴλص����
			nextCity = ant.currentPath.get(0);

			return nextCity;
		}

		proTotal = 0;
		allowedCitys = ant.nonVisitedCitys;
		proArray = new double[allowedCitys.size()];

		for (int i = 0; i < allowedCitys.size(); i++) {
			nextCity = allowedCitys.get(i);
			proArray[i] = calIToJProbably(ant.currentPos, nextCity, currentTime);
			proTotal += proArray[i];
		}

		for (int i = 0; i < allowedCitys.size(); i++) {
			// ��һ������
			proArray[i] /= proTotal;
		}

		// �������ѡ����һ������
		randomNum = random.nextInt(100) + 1;
		randomNum = randomNum / 100;
		// ��Ϊ1.0���޷��жϵ��ģ�,�ܺͻ����޽ӽ�1.0ȡΪ0.99���ж�
		if (randomNum == 1) {
			randomNum = randomNum - 0.01;
		}

		tempPro = 0;
		// ȷ������
		for (int j = 0; j < allowedCitys.size(); j++) {
			if (randomNum > tempPro && randomNum <= tempPro + proArray[j]) {
				// ���ÿ����ķ�ʽ���������ظ�
				nextCity = allowedCitys.get(j);
				break;
			} else {
				tempPro += proArray[j];
			}
		}

		return nextCity;
	}

	/**
	 * ��ȡ����ʱ����ϴӳ���i������j����Ϣ��Ũ��
	 * 
	 * @param t
	 * @param cityI
	 * @param cityJ
	 * @return
	 */
	private double getPheromone(int t, String cityI, String cityJ) {
		double pheromone = 0;
		String key;

		// ��һ�����轫ʱ�䵹��һ����
		key = MessageFormat.format("{0},{1},{2}", cityI, cityJ, t);

		if (pheromoneTimeMap.containsKey(key)) {
			pheromone = pheromoneTimeMap.get(key);
		}

		return pheromone;
	}

	/**
	 * ÿ�ֽ�����ˢ����Ϣ��Ũ�Ⱦ���
	 * 
	 * @param t
	 */
	private void refreshPheromone(int t) {
		double pheromone = 0;
		// ��һ�����ڽ��������Ϣ��Ũ�ȣ�����Ϣ��Ũ��ͼ�в���
		double lastTimeP = 0;
		// ������Ϣ��Ũ��������
		double addPheromone;
		String key;

		for (String i : totalCitys) {
			for (String j : totalCitys) {
				if (!i.equals(j)) {
					// ��һ�����轫ʱ�䵹��һ����
					key = MessageFormat.format("{0},{1},{2}", i, j, t - 1);

					if (pheromoneTimeMap.containsKey(key)) {
						lastTimeP = pheromoneTimeMap.get(key);
					} else {
						lastTimeP = 0;
					}

					addPheromone = 0;
					for (Ant ant : totalAnts) {
						if(ant.pathContained(i, j)){
							// ÿֻ���ϴ�������Ϣ��Ϊ�������ӳ��Ծ����ܳɱ�
							addPheromone += Q / ant.calSumDistance();
						}
					}

					// ���ϴεĽ��ֵ���ϵ���������������ͼ��
					pheromone = p * lastTimeP + addPheromone;
					key = MessageFormat.format("{0},{1},{2}", i, j, t);
					pheromoneTimeMap.put(key, pheromone);
				}
			}
		}

	}

	/**
	 * ��Ⱥ�㷨��������
	 * @param loopCount
	 * �����������
	 * @return 
	 */
	public String antStartSearching(int loopCount) {
		// ��ȺѰ�ҵ��ܴ���
		int count = 0;
		// ѡ�е���һ������
		String selectedCity = "";

		pheromoneTimeMap = new HashMap<String, Double>();
		totalAnts = new ArrayList<Ant>();
		random = new Random();

		while (count < loopCount) {
			initAnts();

			while (true) {
				for (Ant ant : totalAnts) {
					selectedCity = selectAntNextCity(ant, currentTime);
					ant.goToNextCity(selectedCity);
				}

				// ����Ѿ����������г��У�����������ѭ��
				if (totalAnts.get(0).isBack()) {
					break;
				}
			}

			// ����ʱ�����
			currentTime++;
			refreshPheromone(currentTime);
			count++;
		}

		// ���ݾ���ɱ���ѡ������������̵�һ��·��
		Collections.sort(totalAnts);
		bestPath = totalAnts.get(0).currentPath;
    String result = "";
		result += MessageFormat.format("����{0}��ѭ�����������յó������·����", count);
	  result += "\r\nentrance";
		for (String cityName : bestPath) {
			result += (MessageFormat.format("-->{0}", cityName));
		}
    return result;
	}

	/**
	 * ��ʼ����Ⱥ����
	 */
	private void initAnts() {
		Ant tempAnt;
		ArrayList<String> nonVisitedCitys;
		totalAnts.clear();

		// ��ʼ����Ⱥ
		for (int i = 0; i < antNum; i++) {
			nonVisitedCitys = (ArrayList<String>) totalCitys.clone();
			tempAnt = new Ant(pheromoneMatrix, nonVisitedCitys);

			totalAnts.add(tempAnt);
		}
	}
}