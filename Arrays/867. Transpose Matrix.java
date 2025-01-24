// 867. Transpose Matrix

// https://leetcode.com/problems/transpose-matrix/description/

class Solution {
    public int[][] transpose(int[][] matrix) {
       int[][] arr = new int[matrix[0].length][matrix.length];

       for(int row = 0; row < matrix.length; row++){
         for(int col = 0; col < matrix[row].length; col++){
            arr[col][row] = matrix[row][col];

        }
       } 
       return arr;
    } 
}
