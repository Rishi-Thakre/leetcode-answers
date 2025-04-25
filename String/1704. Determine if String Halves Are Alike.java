// 1704. Determine if String Halves Are Alike

// https://leetcode.com/problems/determine-if-string-halves-are-alike/description/

class Solution {
    public boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        String a = s.substring(0,s.length()/2);
        String b = s.substring(s.length()/2);

        int x = 0;
        int y = 0;

        String vowels = "aeiou";

        for(int i=0; i < a.length(); i++){
            if(vowels.indexOf(a.charAt(i)) != -1){
                x++;
            }
            if(vowels.indexOf(b.charAt(i)) != -1){
                y++;
            }
        }
        return x==y;
    }
}
