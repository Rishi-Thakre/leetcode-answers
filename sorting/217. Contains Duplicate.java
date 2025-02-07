// 217. Contains Duplicate

// https://leetcode.com/problems/contains-duplicate/description/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-1; i++){
            if(nums.length>1 && nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
