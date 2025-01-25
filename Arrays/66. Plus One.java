// 66. Plus One

// https://leetcode.com/problems/plus-one/description/

class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
       
        for (int i = n - 1; i >= 0; i--) {
           
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            
            digits[i] = 0;
        }
        
        int[] newDigits = new int[n + 1];
        int k = 0;
        newDigits[0] = 1; 
        for(int j = 1;j < n+1; j++){
            newDigits[j] = digits[k++];
           // k++;
        }
        
        return newDigits;
    }
}
