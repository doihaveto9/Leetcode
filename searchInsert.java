class Solution {
    public int searchInsert(int[] nums, int target) {

        // Iterate over the loop, if target is found, return index
        // Also, if num[index] is greater than target, return index
        // This is because the numbers are presented in increasing order,
        // So the index where the target would be inserted would be the same
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= target){
                return i;
            }
        }

        // If the target is not found, the target must be greater than every
        // entry in nums, so the target would be inserted at the end
        return nums.length;
    }
}