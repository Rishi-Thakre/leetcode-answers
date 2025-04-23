// 1678. Goal Parser Interpretation

// https://leetcode.com/problems/goal-parser-interpretation/description/

class Solution {
    public String interpret(String command) {
        StringBuilder ans = new StringBuilder();

        for(int i=0;i<command.length();i++){
            if(command.charAt(i)== 'G' ){
                ans.append('G');
            }
            else if(command.charAt(i)== '(' && command.charAt(i+1)== ')'){
                ans.append('o');
                i++;
            }
            else if(command.charAt(i)== '(' && command.charAt(i+1)== 'a'){
                ans.append("al");
                i += 3;
            }

        }
        return ans.toString();
    }
}
