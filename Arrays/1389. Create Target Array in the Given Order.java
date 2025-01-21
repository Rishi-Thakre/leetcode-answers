// 1389. Create Target Array in the Given Order

// https://leetcode.com/problems/create-target-array-in-the-given-order/description/

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> targetList = new ArrayList<>(nums.length);
        int[] target = new int[nums.length];

        for(int i = 0;i <index.length;i++){
           targetList.add(index[i],nums[i]);
           }
        for (int j = 0;j<nums.length;j++){
            target[j] = targetList.get(j);
            }
        
        return target;
    }
}
