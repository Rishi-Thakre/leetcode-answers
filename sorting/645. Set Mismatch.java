// 645. Set Mismatch

// https://leetcode.com/problems/set-mismatch/description/

class Solution {
    public int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i , correct);
            } else {
                i++;
            }
        }
        int[] ans = new int[2];
        for(int integer = 0; integer < nums.length; integer++){
            if(nums[integer] != integer+1){
                ans[0]= nums[integer];
                ans[1] = integer+1;
            }
        }
        return ans;
    }
    public void swap(int[] nums,int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
