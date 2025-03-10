// 628. Maximum Product of Three Numbers

// https://leetcode.com/problems/maximum-product-of-three-numbers/description/

class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length-1;

        int x = nums[n]*nums[1]*nums[0];
        int y = nums[n]*nums[n-1]*nums[n-2];

        return Math.max(x,y);
    }
}
