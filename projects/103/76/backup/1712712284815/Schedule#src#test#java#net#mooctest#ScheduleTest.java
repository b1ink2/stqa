package net.mooctest;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ScheduleTest {

    @Test
    public void test() {
        Schedule schedule = new Schedule();
        
        List<Work> works0 = Arrays.asList(); //空作业
        
        List<Work> works = Arrays.asList( 
            new Work("A", 0, 7),
            new Work("B", 1, 5),
            new Work("C", 2, 3)
            );

        List<Work> works1 = Arrays.asList( 
            new Work("A", 0, 7),
            new Work("B", 0, 5),
            new Work("C", 0, 3)
            );
        
        List<Work> works2 = Arrays.asList( //
            new Work("A", -1, -7)
            );
        
        List<Double> results0 = schedule.FCFS(works0);
        
        List<Double> results = schedule.FCFS(works); //FCFS
       
        List<Double> results1 = schedule.SJF(works); 
        
        List<Double> results2 = schedule.SJF(works1); //SJF，同时到达
        
        List<Double> results3 = schedule.SJF(works2);
               
        assertEquals(7.75, results.get(0), 0.0001); // 平均周转时间
        assertEquals(1.7041666666666666, results.get(1), 0.0001); // 平均带权周转时间
        
        assertEquals(7.75, results1.get(0), 0.01); // 平均周转时间
        assertEquals(1.7041666666666666, results1.get(1), 0.0001); // 平均带权周转时间
        
        assertEquals(7.75, results2.get(0), 0.01); // 平均周转时间
        assertEquals(1.7041666666666666, results2.get(1), 0.0001); // 平均带权周转时间
        
    }

}