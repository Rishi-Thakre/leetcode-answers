// 35. Search Insert Position

// https://leetcode.com/problems/search-insert-position/description/

class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

       
        // if (target < start){
        //      // if (target > nums[nums.length-1]){
        //     return nums.length;
        // }return 0;
        // } 

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else
                end = mid - 1;

        }
        return start;

    }
}
