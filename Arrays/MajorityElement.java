package Arrays;

import java.util.Arrays;

/**
 * Given an array nums of size n, return the majority element.
 * The majority element is the element that appears more than ⌊n / 2⌋ times.
 * You may assume that the majority element always exists in the array.
 */
public class MajorityElement {

    static class Solution {
        /**
         * Finds the majority element in the given array.
         *
         * @param nums The input array of integers.
         * @return The majority element if it exists, otherwise -1.
         */
        public int majorityElement(int[] nums) {
            int n = nums.length;
            int maj = n / 2;
            int cnt = 1;
            Arrays.sort(nums);

            for (int i = 1; i < n; i++) {
                if (nums[i] == nums[i - 1]) {
                    cnt++;
                    if (cnt > maj) {
                        return nums[i];
                    }
                } else {
                    cnt = 1;
                }
            }
            return nums[0]; // -1
        }
    }

    public static void main(String[] args) {
        // Example usage:
        int[] exampleArray = { 2, 2, 1, 1, 1, 2, 2 };
        Solution solution = new Solution();
        int result = solution.majorityElement(exampleArray);

        if (result != -1) {
            System.out.println("Majority Element: " + result);
        } else {
            System.out.println("No majority element found.");
        }
    }
}
