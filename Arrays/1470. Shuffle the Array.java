// 1470. Shuffle the Array

// https://leetcode.com/problems/shuffle-the-array/description/

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] shuffled = new int[2*n];
        int k = 0;
        for(int j = 0;j<n;j++){
            shuffled[k++] = nums[j];
            shuffled[k++] = nums[j + n];
        }
        return shuffled;
    }
}
