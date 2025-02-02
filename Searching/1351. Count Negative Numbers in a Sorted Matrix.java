// 1351. Count Negative Numbers in a Sorted Matrix

// https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/description/

class Solution {
    public int countNegatives(int[][] grid) {
        // int row = grid.length;
        // int col = grid[0].length;

        int start = 0;
        int end = grid[0].length-1;

        int nums = 0;

        while(start <= grid.length-1 && end >= 0 ){

            if(grid[start][end] < 0){
                nums+=(grid.length - start);
                end--;
            }
            else start++;
        }
        return nums;
    }
}
