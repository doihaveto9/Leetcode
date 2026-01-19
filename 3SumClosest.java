// Given an integer array nums of length n and an integer target, find three integers at distinct indices in nums such that the sum is closest to target.

// Return the sum of the three integers.

// You may assume that each input would have exactly one solution.

 

// Example 1:

// Input: nums = [-1,2,1,-4], target = 1
// Output: 2
// Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
// Example 2:

// Input: nums = [0,0,0], target = 1
// Output: 0
// Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        // First we sort the array to make 2-pointer iteration easier
        Arrays.sort(nums);

        // Record nums.length and the first possible result
        int n = nums.length;
        int result = nums[0] + nums[1] + nums[2];

        // Loop through all values in the array for the first pointer
        for(int i = 0; i < n - 2; i++){
            // Record the left and right pointers, left starts immediately after i
            // right starts from the end of the array
            int left = i + 1;
            int right = n - 1;

            // While left is less than right
            while(left < right){
                // Record the sum of nums[i], nums[left], and nums[right]
                int sum = nums[i] + nums[left] + nums[right];

                // If sum is closer to target than current result, replace it
                if(Math.abs(target - sum) < Math.abs(target - result))
                    result = sum;

                // If sum is equal to target, immediately return result
                if(sum == target)
                    return target;
                // If sum < target, increase left, because doing so should increase sum
                else if(sum < target)
                    left++;
                // If sum > target, decrease right, this should decrease sum
                else
                    right--;
            }
        }

        return result;
    }
}