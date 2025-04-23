// 442. Find All Duplicates in an Array

// https://leetcode.com/problems/find-all-duplicates-in-an-array/description/

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
       int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i , correct);
            } else {
                i++;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int integer = 0; integer < nums.length; integer++){
            if(nums[integer] != integer+1){
                ans.add(nums[integer]);
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
