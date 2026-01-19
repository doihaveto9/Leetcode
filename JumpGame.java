// You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

// Return true if you can reach the last index, or false otherwise.

 

// Example 1:

// Input: nums = [2,3,1,1,4]
// Output: true
// Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
// Example 2:

// Input: nums = [3,2,1,0,4]
// Output: false
// Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.

class Solution {
    public boolean canJump(int[] nums) {
        // Value reachable is instantiated, this marks how far the player can possibly jump to
        int reachable = 0;

        // Iterate over the array
        for(int i = 0; i < nums.length; i ++) {
            // If the index goes beyond what the player can possibly reach, the answer is false
            if(i > reachable)
                return false;
            
            // Otherwise, the reachable value is calculated by adding the index with the array value at the index
            // If the value is greater than reachable currently, it will become the new max reachable value
            reachable = Math.max(reachable, i + nums[i]);
        }
        return true;
    }
}