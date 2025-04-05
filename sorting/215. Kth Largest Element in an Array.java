// 215. Kth Largest Element in an Array

// https://leetcode.com/problems/kth-largest-element-in-an-array/description/

class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);

        int integer = 1;

      
        return nums[nums.length-k];
    }
}
