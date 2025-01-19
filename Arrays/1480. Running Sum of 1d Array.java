// 1480. Running Sum of 1d Array

// https://leetcode.com/problems/running-sum-of-1d-array/description/

class Solution {
    public int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            if(i==0){
                ans[i] = nums[i];
            }
            else ans[i] = ans[i-1] + nums[i];
        } 
        return ans;
    }
}
