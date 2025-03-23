// 1502. Can Make Arithmetic Progression From Sequence

// https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/description/

class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr); 
        if (arr.length < 3) return true; 

        int diff = arr[1] - arr[0]; 
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != diff) {
                return false; 
            }
        }
        return true; 
    }
}
