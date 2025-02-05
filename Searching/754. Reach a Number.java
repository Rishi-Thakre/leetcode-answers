// 754. Reach a Number

// https://leetcode.com/problems/reach-a-number/description/

class Solution {
    public int reachNumber(int target) {
        int sum = 0;
        int numMoves = 0;

        target = Math.abs(target);

        if(target ==0) return 0;

        while (sum < target){
            sum += numMoves;
            numMoves++;
        }

        while ((sum-target)%2 == 1){
            sum += numMoves;
            numMoves++;
        }
        return numMoves-1;
    }
}
