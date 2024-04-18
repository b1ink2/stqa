package net.mooctest;

import org.junit.Test;
import org.junit.runner.RunWith;

public class CoinChangeTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      new CoinChange().coinChange(new int[]{0}, 0);
  }

}
