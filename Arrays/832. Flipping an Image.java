// 832. Flipping an Image

// https://leetcode.com/problems/flipping-an-image/description/

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
       // int[][] reverse = new int[image.length][image[].length];
        int temp;

        for(int row=0;row< image.length;row++){
            for (int col = 0; col < image[row].length/2;col++){
                temp = image[row][col];
                image[row][col] = image[row][image[row].length -1 - col];
                image[row][image[row].length -1 - col] = temp;
            }
        }
         for(int row=0;row< image.length;row++){
            for (int col = 0; col < image[row].length;col++){
               if (image[row][col] == 0){
                    image[row][col] = 1;
               }
               else if (image[row][col] == 1){
                    image[row][col] = 0;
               }
            }
        }
        return image;
    }
}
