// 1499. Max Value of Equation

// https://leetcode.com/problems/max-value-of-equation/description/

class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
        int max = Integer.MIN_VALUE;
        Deque<int[]> deque = new LinkedList<>();

        for(int[] point : points){
            while(!deque.isEmpty() && point[0] - deque.peekFirst()[0] > k){
                deque.pollFirst();
            }
            if(!deque.isEmpty()){
                max = Math.max(max, point[1] + deque.peekFirst()[1]+ point[0] - deque.peekFirst()[0]);
            }
            while(!deque.isEmpty() && deque.peekLast()[1] - deque.peekLast()[0] <= point[1]- point[0]){
                deque.pollLast();
            }
            deque.offerLast(point);
        }

        // for(int i = 0; i < points.length;i++){
        //     for(int j = i+1; j < points.length;j++){
        //         if(Math.abs(points[i][0] - points[j][0]) <= k){
        //             int currentVal = points[i][1] + points[j][1] + Math.abs(points[i][0] - points[j][0]);
        //             max = Math.max(max,currentVal);
        //         }
        //     }
        // }
        return max;
    }
}
