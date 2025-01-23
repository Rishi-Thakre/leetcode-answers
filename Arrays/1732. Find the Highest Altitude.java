// 1732. Find the Highest Altitude

// https://leetcode.com/problems/find-the-highest-altitude/description/

class Solution {
    public int largestAltitude(int[] gain) {
        int[] altitude = new int[gain.length + 1];
        altitude[0] = 0;
        int maxVal = 0;

        for(int i=1; i<altitude.length;i++){
            altitude[i] = altitude[i-1] + gain[i-1];
        }
        for(int j = 0; j<altitude.length;j++){
            maxVal = Math.max(maxVal,altitude[j]);
        }
        return maxVal;
    }
}
