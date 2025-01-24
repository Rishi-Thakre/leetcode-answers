// 1295. Find Numbers with Even Number of Digits

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

class Solution {
    public int findNumbers(int[] nums) {
        
        int even = 0;

        for(int i = 0; i<nums.length; i++){
            int digit = 0;
            while(nums[i] != 0){
                nums[i] /= 10;
                digit++;
            }
            if (digit % 2 == 0){
                even++;
            }
        }
        return even;
    }
}
