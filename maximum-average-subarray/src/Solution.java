class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxSum = 0;
        double currentSum = 0;

        // Calculate the sum of the first 'k' elements
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }
        maxSum = currentSum;

        // Use sliding window to find the maximum sum of any subarray of size 'k'
        for (int i = k; i < nums.length; i++) {
            currentSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, currentSum);
        }

        // Return the maximum average
        return maxSum / k;

    }


}