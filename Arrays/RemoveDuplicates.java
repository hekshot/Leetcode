package Arrays;

/**
 * Given an integer array nums sorted in non-decreasing order, remove the
 * duplicates in-place such that each unique element appears only once. The
 * relative order of the elements should be kept the same. Then return the
 * number of unique elements in nums.
 * 
 * Consider the number of unique elements of nums to be k, to get accepted, you
 * need to do the following things:
 * 
 * Change the array nums such that the first k elements of nums contain the
 * unique elements in the order they were present in nums initially. The
 * remaining elements of nums are not important as well as the size of nums.
 * Return k.
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        // Example usage
        int[] nums = { 1, 1, 2, 2, 3, 4, 4, 5 };
        RemoveDuplicates remover = new RemoveDuplicates();
        int length = remover.removeDuplicates(nums);

        // Print the modified array and its length
        System.out.println("Modified Array:");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("\nLength after removing duplicates: " + length);
    }

    /**
     * Removes duplicates from a sorted array and modifies the array in place.
     *
     * @param nums The sorted array containing duplicates.
     * @return The length of the modified array after removing duplicates.
     */
    public int removeDuplicates(int[] nums) {
        // Initialize a variable to track the index of the modified array
        int modifiedIndex = 0;

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Check if the current element is equal to the next element (duplicate)
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue; // Skip the duplicate element
            }

            // If not a duplicate, update the modified array with the current element
            nums[modifiedIndex] = nums[i];
            modifiedIndex++;
        }

        // Return the length of the modified array after removing duplicates
        return modifiedIndex;
    }
}
