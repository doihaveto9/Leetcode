// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

// You must implement a solution with a linear runtime complexity and use only constant extra space.

// Example 1:

// Input: nums = [2,2,1]

// Output: 1

// Example 2:

// Input: nums = [4,1,2,1,2]

// Output: 4

// Example 3:

// Input: nums = [1]

// Output: 1

class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);

        int previous = nums[0];
        int current = 0;

        if(nums.length == 1){
            return previous;
        }

        for(int i = 1; i < nums.length; i += 2){
            previous = nums[i - 1];
            current = nums[i];

            if(previous != current)
                return previous;
        }

        return nums[nums.length - 1];
    }
}