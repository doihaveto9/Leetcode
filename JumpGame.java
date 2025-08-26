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