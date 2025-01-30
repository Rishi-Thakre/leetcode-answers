// 441. Arranging Coins

// https://leetcode.com/problems/arranging-coins/description/

class Solution {
    public int arrangeCoins(int n) {
        // int start = 0;
        // int end = n;
        int counter = 1;

        while (n>-1){
            
            n -= counter;

            counter++;
        }
        return counter-2;
    }
}
