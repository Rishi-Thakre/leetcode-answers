// 414. Third Maximum Number

// https://leetcode.com/problems/third-maximum-number/description/

class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        // if(nums.length > 2){
        //     return nums[nums.length-1]-2;
        // }
        // return nums[nums.length-1];
        ArrayList<Integer> list = new ArrayList<>();
        list.add(nums[nums.length-1]);
        for (int i = nums.length-2; i >= 0; i--){
            if(nums[i] != nums[i+1]){
                list.add(nums[i]);
            }

        }
        if(list.size() >= 3){
            return list.get(2);
        }
        return list.get(0);

    }
}
