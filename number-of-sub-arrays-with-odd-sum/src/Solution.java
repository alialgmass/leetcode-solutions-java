public class Solution {
    public int numOfSubarrays(int[] arr) {
        int mod = 1_000_000_007;
        long oddCount = 0;
        long evenCount = 1;
        long currentSum = 0;
        long result = 0;

        for (int num : arr) {
            currentSum += num;
            if (currentSum % 2 == 0) {
                result = (result + oddCount) % mod;
                evenCount++;
            } else {
                result = (result + evenCount) % mod;
                oddCount++;
            }
        }

        return (int) result;
    }
}
