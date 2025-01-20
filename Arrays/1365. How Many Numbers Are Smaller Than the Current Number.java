// 1365. How Many Numbers Are Smaller Than the Current Number

// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];

        for(int i = 0; i<nums.length; i++){
            for(int j = 0; j<nums.length; j++){
                if(nums[i] > nums[j]){
                    ans[i]++;
                }
            }
        }
        return ans;
    }
}
