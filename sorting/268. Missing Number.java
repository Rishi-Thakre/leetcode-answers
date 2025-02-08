// 268. Missing Number

// https://leetcode.com/problems/missing-number/description/

class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if( nums[i] != i){
                return i;
            }
        }
        return nums.length;
    }
}
