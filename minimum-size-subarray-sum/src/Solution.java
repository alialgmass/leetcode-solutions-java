
public class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int minSumLenght = 0;
        int left = 0;
        int currentSum = 0;
        for (int right = 0; right < n; right++) {
            currentSum += nums[right];
            while (currentSum >= target) {
                int currentLength = right - left + 1;
                if (minSumLenght == 0 || currentLength < minSumLenght) {
                    minSumLenght = currentLength;
                }
                currentSum -= nums[left];
                left++;
            }
        }

        return minSumLenght;
    }

}