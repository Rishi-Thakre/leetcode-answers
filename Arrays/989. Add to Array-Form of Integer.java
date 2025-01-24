// 989. Add to Array-Form of Integer

// https://leetcode.com/problems/add-to-array-form-of-integer/description/

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        int carry = k;
        
        for (int i = num.length - 1; i >= 0; i--) {
            int sum = num[i] + carry;
            ans.add(0,sum % 10);
            carry = sum / 10;
        }
        
        while (carry > 0) {
            ans.add(0,carry % 10);
            carry /= 10;
        }
        return ans;
    }
}
