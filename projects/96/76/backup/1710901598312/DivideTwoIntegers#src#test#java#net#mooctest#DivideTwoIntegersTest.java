package net.mooctest;

import static org.junit.Assert.*;
import org.junit.Test;


public class DivideTwoIntegersTest {
  @Test
  public void test() {
      assertEquals(divideOri(0,1),new DivideTwoIntegers().divide(0, 1));
      assertEquals(divideOri(0,-1),new DivideTwoIntegers().divide(0, -1));
      assertEquals(divideOri(10,3),new DivideTwoIntegers().divide(10, 3));
      assertEquals(divideOri(15,-3),new DivideTwoIntegers().divide(15, -3));
      assertEquals(divideOri(-7,2),new DivideTwoIntegers().divide(-7, 2));
      assertEquals(divideOri(Integer.MIN_VALUE,-1),new DivideTwoIntegers().divide(Integer.MIN_VALUE, -1));
  }

  public int divideOri(int dividend, int divisor) {
      boolean sign = (dividend > 0) ^ (divisor > 0);
      int result = 0;
      if(dividend>0) {
          dividend = -dividend;
      }
      if(divisor>0) divisor = -divisor;
      while(dividend <= divisor) {
          int temp_result = -1;
          int temp_divisor = divisor;
          while(dividend <= (temp_divisor << 1)) {
              if(temp_divisor <= (Integer.MIN_VALUE >> 1))break;
              temp_result = temp_result << 1;
              temp_divisor = temp_divisor << 1;
          }
          dividend = dividend - temp_divisor;
          result += temp_result;
      }
      if(!sign) {
          if(result <= Integer.MIN_VALUE) return Integer.MAX_VALUE;
          result = - result;
      }
      return result;
  }
}
