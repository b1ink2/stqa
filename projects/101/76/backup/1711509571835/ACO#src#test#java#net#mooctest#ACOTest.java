package net.mooctest;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import org.junit.Test;

public class ACOTest {

  @Test
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
      double[][] pheromoneMatrix = {
        {-1,-1,-1,0},
        {-1,-1,-1,0},
        {-1,-1,-1,0},
        {0,0,0,0}
      };
      ArrayList<String> nonVisitedCitys = new ArrayList<String>();
      nonVisitedCitys.add("1");
      nonVisitedCitys.add("2");
      nonVisitedCitys.add("3");
      Ant ant0 = new Ant(pheromoneMatrix, nonVisitedCitys);
      System.out.println(aCO1.selectAntNextCity(ant0, 1).toString());
      // assertEquals(aCO1.selectAntNextCity(ant0, 0));

      ArrayList<String[]> arrayList2 = new ArrayList<String[]>();
      arrayList2.add(new String[] {"#"});
      arrayList2.add(new String[] {"#"});
      ACO aCO2 = new ACO(arrayList2, 0, 0, 0.0, 0, 0);
  }
}