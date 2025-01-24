// 1854. Maximum Population Year

// https://leetcode.com/problems/maximum-population-year/description/

class Solution {
    public int maximumPopulation(int[][] logs) {

        int minYear = logs[0][0];
        int maxYear = logs[0][1];

        for (int i = 1; i < logs.length; i++) {
            minYear = Math.min(minYear, logs[i][0]);
            maxYear = Math.max(maxYear, logs[i][1]);
        }

        int years = maxYear - minYear + 1;
        int[] yrpop = new int[years];

        for (int j = 0; j < logs.length; j++) {
            for (int year = logs[j][0]; year < logs[j][1]; year++) {
                ++yrpop[year - minYear];

            }
        }
        int maxPop = yrpop[0];
        for (int i = 1; i < yrpop.length; i++) {
            maxPop = Math.max(maxPop, yrpop[i]);

        }

        for (int i = 0; i < yrpop.length; i++) {
            if (yrpop[i] == maxPop) {
                return minYear + i;
            }
        }

        return 0;
    }
}
