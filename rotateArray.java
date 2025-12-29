class Solution {
    public void rotate(int[] nums, int k) {
        // Instantiate a clone of nums array
        int[] dummy = nums.clone();

        // Save length of array so we don't have to keep getting it from array property
        int length = dummy.length;

        // Iterate over the dummy array
        for(int i = 0; i < length; i++){
            // The index each entry will have is equivalent to it's the remainder of
            // it's previous index + k and the array length.
            // Ex: length = 7, k = 1, the index 6 element will be at the beginning index 0
            // (6 + 1) % 7 == 0
            int new_index = (i + k) % length;

            // Assign each value from dummy to the appropriate index in the nums array
            nums[new_index] = dummy[i];
        }
    }
}