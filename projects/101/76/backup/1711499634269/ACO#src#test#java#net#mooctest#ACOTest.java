package net.mooctest;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

public class ACOTest {

    @Test(timeout = 4000)
    public void testACOConstructor_Normal() {
        ArrayList<String[]> dataArray = new ArrayList<>();
        // ��ӺϷ��ĳ�����������
        dataArray.add(new String[]{"A"});
        dataArray.add(new String[]{"B"});
        // ��ӺϷ��ĳ��м��������
        dataArray.add(new String[]{"1", "2", "10"});
        ACO aCO = new ACO(dataArray, 5, 0.5, 1.0, 0.1, 100);
        // ���ACO�����Ƿ�ɹ�����
        assertNotNull(aCO);
    }

    @Test(timeout = 4000)
    public void testACOConstructor_ZeroAnts() {
        ArrayList<String[]> dataArray = new ArrayList<>();
        // ͬ�ϣ���ӺϷ��ĳ������ƺ;�������
        ACO aCO = new ACO(dataArray, 0, 0.5, 1.0, 0.1, 100);
        // ��鵱��������Ϊ0ʱ�Ƿ��׳��쳣
        try {
            aCO = new ACO(dataArray, 0, 0.5, 1.0, 0.1, 100);
            fail("Expected IllegalArgumentException was not thrown.");
        } catch (IllegalArgumentException e) {
            assertEquals("Ant number cannot be less than or equal to 0.", e.getMessage());
        }
    }

    @Test(timeout = 4000)
    public void testACOConstructor_NegativeAnts() {
        ArrayList<String[]> dataArray = new ArrayList<>();
        // ͬ�ϣ���ӺϷ��ĳ������ƺ;�������
        ACO aCO = new ACO(dataArray, -1, 0.5, 1.0, 0.1, 100);
        // ��鵱��������Ϊ����ʱ�Ƿ��׳��쳣
        try {
            aCO = new ACO(dataArray, -1, 0.5, 1.0, 0.1, 100);
            fail("Expected IllegalArgumentException was not thrown.");
        } catch (IllegalArgumentException e) {
            assertEquals("Ant number cannot be less than or equal to 0.", e.getMessage());
        }
    }

    @Test(timeout = 4000)
    public void testACOConstructor_InvalidParameters() {
        ArrayList<String[]> dataArray = new ArrayList<>();
        // ��Ӳ��Ϸ��Ĳ���ֵ
        ACO aCO = new ACO(dataArray, 5, -0.5, 1.0, 0.1, 100);
        // ��鵱����alphaΪ����ʱ�Ƿ��׳��쳣
        try {
            aCO = new ACO(dataArray, 5, -0.5, 1.0, 0.1, 100);
            fail("Expected IllegalArgumentException was not thrown.");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Invalid parameter value(s)."));
        }
    }

    // ���Լ�����Ӹ���ı��������������������������ݸ�ʽ����ȷ�������
}