package net.mooctest;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class CoinChangeTest {
	
	public int coinChangeOri(int[] coins, int amount) {
	    int max = amount + 1;
	    int[] dp = new int[amount + 1];
	    Arrays.fill(dp, max);
	    dp[0] = 0;
	    for (int i = 1; i <= amount; i++) {
	      for (int j = 0; j < coins.length; j++) {
	        if (coins[j] <= i) {
	          dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
	        }
	      }
	    }
	    return dp[amount] > amount ? -1 : dp[amount];
	  }

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      assertEquals(coinChangeOri(new int[]{1,2,3},0), new CoinChange().coinChange(new int[]{1,2,3},0));
      assertEquals(coinChangeOri(new int[]{},3), new CoinChange().coinChange(new int[]{},3));
      assertEquals(coinChangeOri(new int[]{},3), new CoinChange().coinChange(new int[]{},3));
      
  }

}
