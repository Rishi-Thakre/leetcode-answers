// 1380. Lucky Numbers in a Matrix

// https://leetcode.com/problems/lucky-numbers-in-a-matrix/description/

class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[0].length; col++){
                int minRow = Integer.MAX_VALUE; 
                int maxCol = Integer.MIN_VALUE;

                for(int i = 0; i < matrix[row].length; i++){
                    minRow = Math.min(minRow,matrix[row][i]);
                }
                for(int j = 0; j < matrix.length; j++){
                    maxCol = Math.max(maxCol,matrix[j][col]);
                }


                if(matrix[row][col] == minRow && matrix[row][col] == maxCol){
                    list.add(matrix[row][col]);

                }
            }
        }
        return list;
    }
}
