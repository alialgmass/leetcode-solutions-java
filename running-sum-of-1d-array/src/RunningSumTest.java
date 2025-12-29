import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RunningSumTest {

    @Test
    void testExample1() {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4};
        int[] expected = {1, 3, 6, 10};

        assertArrayEquals(expected, solution.runningSum(nums));
    }

    @Test
    void testExample2() {
        Solution solution = new Solution();
        int[] nums = {1, 1, 1, 1, 1};
        int[] expected = {1, 2, 3, 4, 5};

        assertArrayEquals(expected, solution.runningSum(nums));
    }

    @Test
    void testExample3() {
        Solution solution = new Solution();
        int[] nums = {3, 1, 2, 10, 1};
        int[] expected = {3, 4, 6, 16, 17};

        assertArrayEquals(expected, solution.runningSum(nums));
    }
}
