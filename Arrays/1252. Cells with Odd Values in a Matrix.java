// 1252. Cells with Odd Values in a Matrix

// https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/description/

class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] arr = new int[m][n];

        for (int i = 0; i < indices.length; i++) {
            int row = indices[i][0];
            int col = indices[i][1];

           
            for (int c = 0; c < n; c++) {
                arr[row][c]++;
            }

            
            for (int r = 0; r < m; r++) {
                arr[r][col]++;
            }
        }

            int ans =0;
            for(int r1 = 0; r1<arr.length; r1++){
                for(int c1 = 0; c1<arr[r1].length; c1++){
                    if (arr[r1][c1]%2 !=0 ){
                        ans++;
                    }
                }
            }

        return ans;
    }
}
