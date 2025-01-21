//  1832. Check if the Sentence Is Pangram

// https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/

class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length() < 26){
            return false;
        }
        int[] arr = new int[26];

        for(int i = 0; i < sentence.length(); i++){
            ++arr[sentence.charAt(i)-'a'];
        }
        for(int j = 0; j < 26;j++){
            if(arr[j]==0){
                return false;
            }
        }
        return true;
    }
}
