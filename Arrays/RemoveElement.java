package Arrays;

/**
 * Given an integer array nums and an integer val, remove all occurrences of val
 * in nums in-place. The order of the elements may be changed. Then return the
 * number of elements in nums which are not equal to val.
 * 
 * Consider the number of elements in nums which are not equal to val be k, to
 * get accepted, you need to do the following things:
 * 
 * Change the array nums such that the first k elements of nums contain the
 * elements which are not equal to val. The remaining elements of nums are not
 * important as well as the size of nums.
 * Return k.
 */

public class RemoveElement {

    public static void main(String[] args) {
        // Example of using the removeElement method
        int[] nums = { 3, 2, 2, 3, 4, 5 };
        int valToRemove = 3;

        RemoveElement remover = new RemoveElement();
        int newLength = remover.removeElement(nums, valToRemove);

        System.out.println("New Length of Array: " + newLength);
        System.out.print("Modified Array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    /**
     * Removes all instances of a specified value from an array in-place.
     *
     * @param nums The input array.
     * @param val  The value to be removed.
     * @return The new length of the array after removal.
     */
    public int removeElement(int[] nums, int val) {
        int k = 0; // Pointer to keep track of the current position to overwrite

        // Iterate through the array
        for (final int num : nums) {
            // If the current element is not equal to the value to be removed
            if (num != val) {
                // Move the current element to the current position pointed by 'k'
                nums[k++] = num;
            }
        }

        // 'k' now represents the new length of the array after removal
        return k;
    }
}
