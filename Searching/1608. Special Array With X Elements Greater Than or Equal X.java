// 1608. Special Array With X Elements Greater Than or Equal X

// https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/description/

class Solution {
    public int specialArray(int[] nums) {

        Arrays.sort(nums);

        for (int i = 0; i <= nums[nums.length - 1]; i++) {
            int counter = 0;

            for (int num : nums) {
                if (num >= i) {
                    counter++;
                }
            }
            if (counter == i) {
                return i;
            }
        }
        return -1;
    }
}
