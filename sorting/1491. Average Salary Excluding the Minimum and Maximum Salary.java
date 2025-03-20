// 1491. Average Salary Excluding the Minimum and Maximum Salary

// https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/description/

class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int sum = Arrays.stream(salary).sum();
        sum = sum-salary[0]-salary[salary.length-1];
        double ans = (double) sum / (salary.length-2);
        return ans;
    }
}
