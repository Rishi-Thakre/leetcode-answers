// 34. Find First and Last Position of Element in Sorted Array

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];

        ans[0] = firstOccurance(nums, target);

        ans[1] = lastOccurance(nums, target);

        return ans;
    }

    private static int firstOccurance(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int fo = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                fo = mid;
                right = mid - 1;

            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return fo;
    }

    private static int lastOccurance(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int lo = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                lo = mid;
                left = mid + 1;

            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return lo;
    }
}
