/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 */

package Arrays;

public class TwoSum {

    public static void main(String[] args) {
        // Example usage
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        TwoSum twoSumSolver = new TwoSum();
        int[] result = twoSumSolver.twoSum(nums, target);

        // Print the result
        System.out.println("Indices of the two numbers that add up to the target:");
        System.out.println("Index 1: " + result[0] + ", Index 2: " + result[1]);
    }

    /**
     * Finds two numbers in an array that add up to the target.
     *
     * @param nums   The array of integers.
     * @param target The target sum.
     * @return An array containing the indices of the two numbers that add up to the
     *         target.
     */
    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];

        // Iterate through the array to find the two numbers
        for (int i = 0; i < nums.length; i++) {
            int num1 = nums[i];

            // Check the remaining elements for a pair that adds up to the target
            for (int j = i + 1; j < nums.length; j++) {
                int num2 = nums[j];

                if (num1 + num2 == target) {
                    // Found the pair, store the indices in the result array
                    indices[0] = i;
                    indices[1] = j;
                    return indices;
                }
            }
        }

        // If no such pair is found, return an array with -1 values
        return indices;
    }
}
