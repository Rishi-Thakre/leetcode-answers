// 976. Largest Perimeter Triangle

// https://leetcode.com/problems/largest-perimeter-triangle/description/

class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);

        for(int i = nums.length-1; i > 1; i--){
            if(nums[i]<(nums[i-1]+nums[i-2])){
                return nums[i] + nums[i-1] + nums[i-2];
            }
        }
        return 0;
    }
}
