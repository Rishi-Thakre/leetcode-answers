// 53. Maximum Subarray

// https://leetcode.com/problems/maximum-subarray/description/

class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum = Integer.MIN_VALUE;
        for(int i=0;i<nums.length; i++){
            
            if (sum<0){
                sum = 0;
            }
            sum += nums[i];
            maxSum = Math.max(maxSum,sum);
        }
        return maxSum;
    }
}
