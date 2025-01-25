// 26. Remove Duplicates from Sorted Array

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

class Solution {
    public int removeDuplicates(int[] nums) {
       // int[] expectedNums = new int[nums.length];
        
       // int counter = 0;
    
        int k = 1;
        //expectedNums[0] = nums[0];
         for(int i =1; i < nums.length; i++){
            if(nums[i] != nums[i-1] ){
                nums[k] = nums[i];
            //expectedNums[k] = expectedNums[k]+1;

                k++;
            }
        }
        return k;
    }
}
