// 1304. Find N Unique Integers Sum up to Zero

// https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/description/

class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int sum = 0;
        int[] arr1 = {-5,5};

        if(n==2){
            return arr1;
        }

        for(int i = 0; i < n-1; i++){
            arr[i] = i;
            sum += i; 
        }
        arr[n-1] = sum - (2*sum);
        return arr;
        
    }
}
