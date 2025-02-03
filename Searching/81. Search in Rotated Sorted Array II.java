// 81. Search in Rotated Sorted Array II

// https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/

class Solution {
    public boolean search(int[] nums, int target) {

        // if(nums.length == 0){
        //     return false;
        // }

        if(nums.length == 1){
            return(nums[0] == target);
        }
        int pivot = findPivot(nums);

        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }
        if (nums[pivot] == target) {
            return true;
        }
        if ( target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    public boolean binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else
                end = mid - 1;
        }
        return false;
    }

    public int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        if(arr[start]<arr[end]){
            return end;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {

                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            else if (arr[mid] >= arr[start] ) {
                start = mid + 1;
            } else
                end = mid - 1;

        }
        return -1;
    }
}
