// 1250. Check If It Is a Good Array

// https://leetcode.com/problems/check-if-it-is-a-good-array/description/

import java.math.*;

class Solution {
    public boolean isGoodArray(int[] nums) {

        int gcdNum = nums[0];

        for (int i = 0; i < nums.length; i++) {

            gcdNum = gcd(gcdNum, nums[i]);

            if (gcdNum == 1) {
                return true;
            }
        }

        return gcdNum == 1;

    }

    private int gcd(int a, int b) {

        return BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).intValue();
    }
}
