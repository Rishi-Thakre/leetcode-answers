// 41. First Missing Positive

// https://leetcode.com/problems/first-missing-positive/description/

class Solution {
    public int firstMissingPositive(int[] nums) {
        
        int missing = 1;
        Arrays.sort(nums);

        for(int number : nums){
            if (number > 0){
                if (number == missing){
                    missing++;
                }
                if (number > missing){
                    break;
                }
            }
        }

        return missing;
    }
}
