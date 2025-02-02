// 888. Fair Candy Swap

// https://leetcode.com/problems/fair-candy-swap/description/

class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
       // Array.sort(aliceSizes);
        Arrays.sort(bobSizes);

        int aliceSum = Arrays.stream(aliceSizes).sum();
        int bobSum = Arrays.stream(bobSizes).sum();

        int delta = (bobSum - aliceSum )/2;

        for (int a : aliceSizes){
           if (binarySearch(bobSizes,a+delta)){
            return new int[]{a,a+delta};
           }
        }
        return new int[]{-1,-1};
    }

    public boolean binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start +(end-start)/2;
            if(arr[mid]==target){
                return true;
            }
            else if(arr[mid] < target){
                start = mid+1;
            }
            else end = mid-1;
        }
        return false;
    }
}
