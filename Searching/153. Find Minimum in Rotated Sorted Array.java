// 153. Find Minimum in Rotated Sorted Array

// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/

class Solution {
    public int findMin(int[] nums) {
        int pivot = findPivot(nums);
        return nums[pivot+1];
    }
    public int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if( arr[mid] >= arr[start]){
                start = mid+1;
            }
            else end = mid-1;
        }
        return -1;
    }
}
