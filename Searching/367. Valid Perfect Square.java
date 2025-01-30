// 367. Valid Perfect Square

// https://leetcode.com/problems/valid-perfect-square/description/

class Solution {
    public boolean isPerfectSquare(int num) {
        return mySqrt(num) * mySqrt(num) == num;
    }

    public int mySqrt(int num) {
        int start = 0;
        int end = num;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if ((long)mid * (long)mid == num) {
                return mid;
            } else if ((long)mid * (long)mid < num) {
                start = mid + 1;
            } else
                end = mid - 1;
        }
        return end;
    }
}
