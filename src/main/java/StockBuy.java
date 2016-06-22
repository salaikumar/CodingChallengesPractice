/*
* Stock Market Problem
Say you have an array for which the ith element is the price of a given stock on day i.
If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock),
design an algorithm to find the maximum profit.
*/

import java.util.*;

public class StockBuy{

  // return the max profit obtained
  // using dynamic programming
  // this is a solution i wrote before a long time
  public int maxProfit(int[] prices) {
    if(prices.length == 0)
           return 0;

     int[] maxProfitDay = new int[ prices.length];
     int maxSoFar = 0;
     maxProfitDay[0] = 0;
     for (int i =1 ; i < prices.length; ++i){
          int temp = prices[i] - prices[i-1];
          maxProfitDay[i] = maxProfitDay[i-1] + temp;
          if ( maxProfitDay[i] < 0)
              maxProfitDay[i] = 0;
          if ( maxSoFar < maxProfitDay[i])
              maxSoFar = maxProfitDay[i];
     }
     return maxSoFar;
  }

  // Solution just by using temporary variables
  public int maxProfitNoDP(int[] prices){
    return 0;
  }

}
