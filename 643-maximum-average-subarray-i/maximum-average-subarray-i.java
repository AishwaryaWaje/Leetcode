class Solution {
    public double findMaxAverage(int[] nums, int k) {
         int n = nums.length;
        
        double Sum = 0;
        for (int i = 0; i < k; i++) {
            Sum += nums[i];
        }
        
        double maxSum = Sum;
        
        for (int i = k; i < n; i++) {
            Sum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, Sum);
        }
        
        return maxSum / k;
    }
}