// 1886. Determine Whether Matrix Can Be Obtained By Rotation

// https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/description/

class Solution {
    public int[][] rotate(int[][] matrix){
        int n = matrix.length;
        int[][] rotated = new int[n][n];

        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                rotated[col][n-1-row] = matrix[row][col];
            }
        } 
        return rotated;
    }

    public boolean isEqual(int[][] mat, int[][] target){
        for(int row=0;row<mat.length;row++){
            for(int col=0;col<mat.length;col++){
                if (mat[row][col] != target[row][col]){
                    return false;
                }
            }
        }
        return true; 
    }
  
    public boolean findRotation(int[][] mat, int[][] target) {

        for(int i = 0; i<4;i++ ){
            if(isEqual(mat,target)){
                return true;
            }
            mat = rotate(mat);
        }
        return false;        
    }
}
