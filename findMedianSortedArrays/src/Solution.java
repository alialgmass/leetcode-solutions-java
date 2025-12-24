import java.util.Arrays;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        int[] mergedSortedArray= new int [length];
        int idx=0;
        for (int n : nums1) mergedSortedArray[idx++] = n;
        for (int n : nums2) mergedSortedArray[idx++] = n;
        Arrays.sort(mergedSortedArray);
        int mid = mergedSortedArray.length / 2;
        if (mergedSortedArray.length % 2 == 0) {
            return (mergedSortedArray[mid - 1] + mergedSortedArray[mid]) / 2.0;
        } else {
            return mergedSortedArray[mid];
        }
    }
}