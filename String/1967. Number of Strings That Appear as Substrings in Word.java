// 1967. Number of Strings That Appear as Substrings in Word

// https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/description/

class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int n = 0;
        for(String pattern : patterns){
            if(word.contains(pattern)){
                n++;
            }

        }
        return n;
    }
}
