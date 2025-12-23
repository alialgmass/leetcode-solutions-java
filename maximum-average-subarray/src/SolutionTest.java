import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;



class SolutionTest {
    private final Solution solution = new Solution();
    @Test
    void findMaxAverage() {
        Solution solution = new Solution();
        assertEquals(12.75, solution.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4), 0.00001);
        assertEquals(5.0, solution.findMaxAverage(new int[]{5}, 1), 0.00001);
    }
    @Test
    void testAllNegativeNumbers() {
        int[] nums = {-5, -10, -3, -4};
        int k = 2;

        double result = solution.findMaxAverage(nums, k);

        // max average = (-3 + -4) / 2 = -3.5
        assertEquals(-3.5, result, 1e-5);
    }

    @Test
    void testKEqualsArrayLength() {
        int[] nums = {2, 4, 6, 8};
        int k = 4;

        double result = solution.findMaxAverage(nums, k);

        assertEquals(5.0, result, 1e-5);
    }
    @Test
    void testVeryLargeInput() {
        int n = 100000000;
        int k = 10;
        int[] nums = new int[n];

        // Fill array with values
        for (int i = 0; i < n; i++) {
            nums[i] = i % 100; // numbers from 0 to 99
        }

        double result = solution.findMaxAverage(nums, k);

        // Expected max average = (90+91+...+99)/10 = 94.5
        assertEquals(94.5, result, 1e-5);
    }


}