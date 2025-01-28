// 73. Set Matrix Zeroes

// https://leetcode.com/problems/set-matrix-zeroes/description/

class Solution {
    public void setZeroes(int[][] matrix) {
        int[] row = new int[matrix.length];
        int[] col = new int[matrix[0].length];

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                if (matrix[r][c] == 0) {
                    row[r] = 1;
                    col[c] = 1;
                }
            }
        }
        for (int i = 0; i < row.length; i++) {
            if (row[i] == 1) {
                for (int j = 0; j < col.length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < col.length; i++) {
            if (col[i] == 1) {
                for (int j = 0; j < row.length; j++) {
                    matrix[j][i] = 0;
                }
            }
        }
        System.out.println(matrix);
    }
}
