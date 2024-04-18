package net.mooctest;

import java.util.ArrayList;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

public class ACOTest {

  @Test(timeout = 4000)
  public void test(){
      ArrayList<String[]> arrayList0 = new ArrayList<String[]>();
      ACO aCO0 = new ACO(arrayList0, 0, 0, 0.0, 0, 0);
      
      ArrayList<String[]> arrayList1 = new ArrayList<String[]>();
      arrayList1.add(new String[]{"#"});
      arrayList1.add(new String[]{"1"});
      arrayList1.add(new String[]{"2"});
      arrayList1.add(new String[]{"3"});
      arrayList1.add(new String[]{"4"});
      arrayList1.add(new String[]{"#"});
      arrayList1.add(new String[]{"1", "4", "1.0"});
      arrayList1.add(new String[]{"1", "2", "10.0"});
      arrayList1.add(new String[]{"1", "3", "100.0"});
      arrayList1.add(new String[]{"2", "4", "2.0"});
      arrayList1.add(new String[]{"2", "3", "20.0"});
      arrayList1.add(new String[]{"3", "4", "200.0"});
      ACO aCO1 = new ACO(arrayList1, 20, 1, 2, 1, 2);
      
      aCO1.antStartSearching(3);
      
  }

}