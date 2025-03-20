// 1051. Height Checker

// https://leetcode.com/problems/height-checker/description/

class Solution {
    public int heightChecker(int[] heights) {
        int[] expected = new int[heights.length];
        for(int i = 0; i < heights.length; i++){
            expected[i] = heights[i];
        }

        Arrays.sort(expected);
        int ans = 0;

        for(int j = 0; j < heights.length; j++){
            if(expected[j] != heights[j]){
                ans++;
            }
        }
        return ans;
    }
}
