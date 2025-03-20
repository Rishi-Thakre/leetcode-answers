// 1464. Maximum Product of Two Elements in an Array

// https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/description/

class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
    }
}
