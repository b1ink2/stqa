package net.mooctest;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class AntTest {

  @Test(timeout = 4000)
  public void test(){
      ArrayList<String> arrayList0 = new ArrayList<String>();
      Ant ant0 = null;

      ArrayList<String> arrayList1 = new ArrayList<String>();
      double[][] doubleArray0 = new double[1][1];
      doubleArray0[0][0] = 1.0;
      Ant ant1 = new Ant(doubleArray0, arrayList1);
  }
}
