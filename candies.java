// There are n children standing in a line. Each child is assigned a rating value given in the integer array ratings.

// You are giving candies to these children subjected to the following requirements:

// Each child must have at least one candy.
// Children with a higher rating get more candies than their neighbors.
// Return the minimum number of candies you need to have to distribute the candies to the children.

 

// Example 1:

// Input: ratings = [1,0,2]
// Output: 5
// Explanation: You can allocate to the first, second and third child with 2, 1, 2 candies respectively.
// Example 2:

// Input: ratings = [1,2,2]
// Output: 4
// Explanation: You can allocate to the first, second and third child with 1, 2, 1 candies respectively.
// The third child gets 1 candy because it satisfies the above two conditions.
 

// Constraints:

// n == ratings.length
// 1 <= n <= 2 * 104
// 0 <= ratings[i] <= 2 * 104

class Solution {
    public int candy(int[] ratings) {

        // Instantiate array length n, candies array, and result int
        int n = ratings.length;
        int[] candies = new int[n];
        int result = 0;

        // Fill candies array with 1's
        Arrays.fill(candies, 1);

        
        // Iterate through the array forward, making sure each value has more candies than it's
        // previous value if their rating is higher
        for (int i = 1; i < n; i++)
            if (ratings[i] > ratings[i - 1])
                candies[i] = candies[i - 1] + 1;

        // Iterate backwards now, making sure each value is meeting the requirements, and change it if it's not
        for (int i = n - 1; i > 0; i--) {
            if (ratings[i - 1] > ratings[i])
                candies[i - 1] = Math.max(candies[i] + 1, candies[i - 1]);
            
            result += candies[i - 1];
        }

        result += candies[n - 1];

        return result;
    }
}