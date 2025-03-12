// 905. Sort Array By Parity

// https://leetcode.com/problems/sort-array-by-parity/

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int l = 0; int r = 1;

        while (l<nums.length-1 && r<nums.length){
            if(nums[l]%2==1 && nums[r]%2==0){
                swap(nums,l,r);
                
            }
            if(nums[l]%2!=1){
                l++;
                r++;
            }
            else r++;
        }
        return nums;
    }
    public void swap(int[] nums, int num1, int num2){
        int temp = nums[num1];
        nums[num1] = nums[num2];
        nums[num2] = temp;
    }
    
}
