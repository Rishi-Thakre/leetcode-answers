// 1672. Richest Customer Wealth

// https://leetcode.com/problems/richest-customer-wealth/description/

class Solution {
    public int maximumWealth(int[][] accounts) {
        int[] sum = new int[accounts.length];
        for (int row = 0;row < accounts.length ;row++){
            for (int col=0; col <accounts[row].length;col++){
              sum[row] = sum[row] + accounts[row][col];
            }
        }
        int maxVal = sum[0];
      for (int i = 0; i < sum.length; i++){
        if (maxVal < sum[i]){
          maxVal = sum[i];
        }
      }
      return maxVal;
    }
    
}
