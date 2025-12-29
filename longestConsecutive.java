// Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

// You must write an algorithm that runs in O(n) time.

 

// Example 1:

// Input: nums = [100,4,200,1,3,2]
// Output: 4
// Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
// Example 2:

// Input: nums = [0,3,7,2,5,8,4,6,0,1]
// Output: 9
// Example 3:

// Input: nums = [1,0,1,2]
// Output: 3
 

// Constraints:

// 0 <= nums.length <= 105
// -109 <= nums[i] <= 109

class Solution {
    public int longestConsecutive(int[] nums) {
        // Instantiate set that will hold all unique numbers in array
        Set<Integer> numSet = new HashSet<>();

        // Fill set
        for(int num : nums){
            numSet.add(num);
        }

        // Instantiate longest int
        int longest = 0;

        // Check every num in the array
        for(int num : numSet) {
            // If numSet does not contain the number before num, it is considered a start of a sequence
            if(!numSet.contains(num - 1)) {
                // Instantiate length as 1
                int length = 1;

                // increment length until numSet does not contain the next in the sequence
                while(numSet.contains(num + length)){
                    length++;
                }

                // Check if the sequence length is longer than the longest recorded
                longest = Math.max(longest, length);
            }
        }

        // Return longest length
        return longest;
    }
}