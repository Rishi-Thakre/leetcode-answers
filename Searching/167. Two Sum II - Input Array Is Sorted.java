// 167. Two Sum II - Input Array Is Sorted

// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;

        while(start < end){
           // int mid = start + (end-start)/2;

            if(numbers[start]+numbers[end] == target){
                return new int[] {start+1, end+1};
            }
            else if(numbers[start]+numbers[end] > target){
                end--;
            }
            else start++;        
        }
        return new int[] {-1,-1};
    }
}
