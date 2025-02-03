// 540. Single Element in a Sorted Array

// https://leetcode.com/problems/single-element-in-a-sorted-array/description/

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = n-1;

        if (n == 1) {
            return nums[0];
        }
        if (nums[0] != nums[1]) {
            return nums[0];
        }
        if (nums[end] != nums[end-1]) {
            return nums[end];
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            //  if (end == mid && mid == start) {
            //     return nums[mid];
            // }
            if (nums[mid] != nums[mid + 1] && nums[mid] != nums[mid - 1]) {
                return nums[mid];
            }

            if ((mid % 2 == 0 && nums[mid] == nums[mid + 1]) || (mid % 2 != 0 && nums[mid] == nums[mid - 1])) {
                start = mid + 1;
            } else if ((mid % 2 == 0 && nums[mid] != nums[mid + 1]) || (mid % 2 != 0 && nums[mid] != nums[mid - 1])) {
                end = mid - 1;
            } 
            // else {
            //     return nums[mid + 1];
            // }
            // if (mid==0) {
            //     return nums[0];
            // }
            
            
        }

        return -1;
    }
}
