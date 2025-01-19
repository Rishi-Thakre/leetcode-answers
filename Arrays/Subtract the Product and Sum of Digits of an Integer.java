// 1281. Subtract the Product and Sum of Digits of an Integer

// https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

class Solution {
    public static int subtractProductAndSum(int n) {
     
        int sum = 0 ; int pr = 1; int result = 0;
        while (n>0){
            int dig = n % 10;

          sum = sum + dig;
           pr = pr * dig;

            n = n/10; 
        }
       result = pr - sum;
        return (result);
    }
    public static void main(String[] args){
     
       System.out.println(subtractProductAndSum(4421));

    }
}
