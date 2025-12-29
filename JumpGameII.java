// You are given a 0-indexed array of integers nums of length n. You are initially positioned at index 0.

// Each element nums[i] represents the maximum length of a forward jump from index i. In other words, if you are at index i, you can jump to any index (i + j) where:

// 0 <= j <= nums[i] and
// i + j < n
// Return the minimum number of jumps to reach index n - 1. The test cases are generated such that you can reach index n - 1.

 

// Example 1:

// Input: nums = [2,3,1,1,4]
// Output: 2
// Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.
// Example 2:

// Input: nums = [2,3,0,1,4]
// Output: 2
 

// Constraints:

// 1 <= nums.length <= 104
// 0 <= nums[i] <= 1000
// It's guaranteed that you can reach nums[n - 1].

class Solution {
    public int jump(int[] nums) {
        // In order to go about this one, instead of checking if we are going to be able to reach the end,
        // since here that is a given, we are instead going to keep track of exactly how far we are capable
        // of reaching at all times, based on the jump points that are available to us and how far each would
        // have us end up

        // Instantiate variables to track jump data
        int near = 0, far = 0, jumps = 0;

        // loop until the far index matches or exceeds the last index of the array, when this happens, we'll have
        // hit the minimum number of jumps where the end of the array could have been found;
        while(far < nums.length - 1){
            // Farthest resets to 0
            int farthest = 0;

            // Iterate over the range between near and far indices
            for(int i = near; i <= far; i++){
                // Update farthest to match the max 
                farthest = Math.max(farthest, i + nums[i]);
            }

            // We have to jump at least one step each time, so near becomes what far currently is plus 1
            near = far + 1;

            // far is then updated to match the farthest we are capable of jumping based on available positions and values
            far = farthest;

            // Increment jumps
            jumps++;
        }

        return jumps;
    }
}