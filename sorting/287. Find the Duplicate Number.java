// 287. Find the Duplicate Number

// https://leetcode.com/problems/find-the-duplicate-number/description/

class Solution {
    public int findDuplicate(int[] nums) {
        int[] ans = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            ans[i] = nums[i];
        }

        Arrays.sort(nums);

        for(int i = 0; i < nums.length-1; i++){
            if(nums.length>1 && nums[i] == nums[i+1]){
                return nums[i];
            }
        }
        return -1;

    }
}
