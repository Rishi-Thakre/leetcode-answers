// 977. Squares of a Sorted Array

// https://leetcode.com/problems/squares-of-a-sorted-array/description/

class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            nums[i] = Math.abs(nums[i])*Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        return nums;
    }
}
