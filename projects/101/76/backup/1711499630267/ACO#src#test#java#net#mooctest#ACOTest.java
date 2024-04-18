package net.mooctest;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

public class ACOTest {

    @Test(timeout = 4000)
    public void testACOConstructor_Normal() {
        ArrayList<String[]> dataArray = new ArrayList<>();
        // 添加合法的城市名称数据
        dataArray.add(new String[]{"A"});
        dataArray.add(new String[]{"B"});
        // 添加合法的城市间距离数据
        dataArray.add(new String[]{"1", "2", "10"});
        ACO aCO = new ACO(dataArray, 5, 0.5, 1.0, 0.1, 100);
        // 检查ACO对象是否成功创建
        assertNotNull(aCO);
    }

    @Test(timeout = 4000)
    public void testACOConstructor_ZeroAnts() {
        ArrayList<String[]> dataArray = new ArrayList<>();
        // 同上，添加合法的城市名称和距离数据
        ACO aCO = new ACO(dataArray, 0, 0.5, 1.0, 0.1, 100);
        // 检查当蚂蚁数量为0时是否抛出异常
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
        // 同上，添加合法的城市名称和距离数据
        ACO aCO = new ACO(dataArray, -1, 0.5, 1.0, 0.1, 100);
        // 检查当蚂蚁数量为负数时是否抛出异常
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
        // 添加不合法的参数值
        ACO aCO = new ACO(dataArray, 5, -0.5, 1.0, 0.1, 100);
        // 检查当参数alpha为负数时是否抛出异常
        try {
            aCO = new ACO(dataArray, 5, -0.5, 1.0, 0.1, 100);
            fail("Expected IllegalArgumentException was not thrown.");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Invalid parameter value(s)."));
        }
    }

    // 可以继续添加更多的变异测试用例，例如测试输入数据格式不正确的情况等
}