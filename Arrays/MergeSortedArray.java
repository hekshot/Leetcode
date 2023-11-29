package Arrays;

/**
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
 * representing the number of elements in nums1 and nums2 respectively.
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * The final sorted array should not be returned by the function, but instead
 * be stored inside the array nums1. To accommodate this, nums1 has a length 
 * of m + n, where the first m elements denote the elements that should be merged,
 * and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 */

import java.util.Arrays;

public class MergeSortedArray {

    // Merge two sorted arrays into the first array
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Pointers for array nums1, nums2, and the merged result
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        // Merge arrays while there are elements in both nums1 and nums2
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // If there are remaining elements in nums2, copy them to nums1
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

    // Main method to test the merge function
    public static void main(String[] args) {
        MergeSortedArray merger = new MergeSortedArray();

        // Example usage
        int[] nums1 = new int[] { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int[] nums2 = new int[] { 2, 5, 6 };
        int n = 3;

        System.out.println("Original Arrays:");
        System.out.println("nums1: " + Arrays.toString(nums1));
        System.out.println("nums2: " + Arrays.toString(nums2));

        // Merge arrays
        merger.merge(nums1, m, nums2, n);

        // Display merged result
        System.out.println("\nMerged Array:");
        System.out.println(Arrays.toString(nums1));
    }
}
