// 1346. Check If N and Its Double Exist

// https://leetcode.com/problems/check-if-n-and-its-double-exist/description/

class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);

        int i = arr.length - 1;

        while (i >= 0) {
            if (binarySearch(arr, arr[i], i)) {
                return true;
            }
            i--;
        }
        return false;
    }

    public boolean binarySearch(int[] arr, int target, int index) {
        if (target >= 0) {
            int start = 0;
            int end = index - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (2 * arr[mid] == target) {
                    return true;
                } else if (2 * arr[mid] < target) {
                    start = mid + 1;
                } else
                    end = mid - 1;
            }
            return false;
        } else {
            int start = index + 1;
            int end = arr.length - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (2 * arr[mid] == target) {
                    return true;
                } else if (2 * arr[mid] < target) {
                    start = mid + 1;
                } else
                    end = mid - 1;
            }
            return false;
        }
    }
}
