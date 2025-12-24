import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void testOddTotalLength() {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        double result = solution.findMedianSortedArrays(nums1, nums2);

        assertEquals(2.0, result);
    }

    @Test
    void testEvenTotalLength() {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};

        double result = solution.findMedianSortedArrays(nums1, nums2);

        assertEquals(2.5, result);
    }

    @Test
    void testOneEmptyArray() {
        int[] nums1 = {};
        int[] nums2 = {1};

        double result = solution.findMedianSortedArrays(nums1, nums2);

        assertEquals(1.0, result);
    }

    @Test
    void testDifferentSizes() {
        int[] nums1 = {1, 5, 8};
        int[] nums2 = {2, 3};

        double result = solution.findMedianSortedArrays(nums1, nums2);

        assertEquals(3.0, result);
    }

    @Test
    void testNegativeNumbers() {
        int[] nums1 = {-5, -3, -1};
        int[] nums2 = {-2, 0, 2};

        double result = solution.findMedianSortedArrays(nums1, nums2);

        assertEquals(-1.5, result);
    }

    @Test
    void testSingleElementEach() {
        int[] nums1 = {1};
        int[] nums2 = {2};

        double result = solution.findMedianSortedArrays(nums1, nums2);

        assertEquals(1.5, result);
    }
}
