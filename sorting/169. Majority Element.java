// 169. Majority Element

// https://leetcode.com/problems/majority-element/description/

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
