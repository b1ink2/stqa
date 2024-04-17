package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;

public class CoinChangeTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      new CoinChange().coinChange(new int[]{0}, 0);
  }

}
