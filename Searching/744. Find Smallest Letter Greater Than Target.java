// 744. Find Smallest Letter Greater Than Target

// https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length -1 ;
        
        while(start <= end){
            int mid = start +(end-start)/2;

            // if (mid == (letters.length - 1) && letters[mid] == target){
            //     return letters[0];
            // }
            // if (letters[mid] == target){
            //     return letters[mid+1];
           // }
            if (letters[mid] <= target){
                start = mid+1;
            }
            else end = mid-1;
        }
        return letters[start % letters.length];

    }
}
