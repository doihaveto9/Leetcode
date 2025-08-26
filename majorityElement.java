class Solution {
    public int majorityElement(int[] nums) {
        // initialize an answer value and a count value
        int ans = 0;
        int count = 0;

        // Iterate over the array
        for(int num : nums){
            // If count is zero, replace the ans with the current num
            if(count == 0){
                ans = num;
            }

            // If num == the current answer candidate, increase count
            if(num == ans){
                count++;
            }

            // otherwise, decrement it
            else
                count--;
        }

        // Return ans
        return ans;
    }
}