class Solution {
    public int firstMissingPositive(int[] nums) {
		// Get the length of the input array
        int length = nums.length;

		// If the array only has one value, the answer will either be 1 or 2
        if(length == 1){
            if(nums[0] == 1){
                return 2;
            }
            else{
                return 1;
            }
        }

		// Set up a new int array that will record what numbers are present
		// in nums array
        int[] check = new int[length];

        for(int i : nums){
            if(i > 0 && i <= length){
                check[i - 1]++;
            }
        }

		// after iterating over nums array, iterate over the check array
		// return the first value found where the entry is 0
        for(int j = 0; j < check.length; j++){
            if(check[j] == 0){
                return j + 1;
            }
        }

		// If no such entry is found, return length + 1
        return length + 1;
    }
}