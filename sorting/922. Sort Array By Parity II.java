// 922. Sort Array By Parity II

// https://leetcode.com/problems/sort-array-by-parity-ii/description/

class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int l = 0; int r = 1;

        while (l<nums.length-1 && r<nums.length){
            if(nums[l]%2==1 && nums[r]%2==0 && l%2 == 0 && r%2 == 1){
                swap(nums,l,r);
                
            }
            if(nums[l]%2!=1 ){
                l =l+2;
            //    r++;
            }
            else r=r+2;
        }
        return nums;
    }
    public void swap(int[] nums, int num1, int num2){
        int temp = nums[num1];
        nums[num1] = nums[num2];
        nums[num2] = temp;
    }
}
