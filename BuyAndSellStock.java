// You are given an integer array prices where prices[i] is the price of a given stock on the ith day.

// On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can sell and buy the stock multiple times on the same day, ensuring you never hold more than one share of the stock.

// Find and return the maximum profit you can achieve.

 

// Example 1:

// Input: prices = [7,1,5,3,6,4]
// Output: 7
// Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
// Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
// Total profit is 4 + 3 = 7.
// Example 2:

// Input: prices = [1,2,3,4,5]
// Output: 4
// Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
// Total profit is 4.
// Example 3:

// Input: prices = [7,6,4,3,1]
// Output: 0
// Explanation: There is no way to make a positive profit, so we never buy the stock to achieve the maximum profit of 0.
 

// Constraints:

// 1 <= prices.length <= 3 * 104
// 0 <= prices[i] <= 104

class Solution {
    public int maxProfit(int[] prices) {
        // Establish int n to hold length of prices array, and net array to track stock price differences
        int n = prices.length;
        int net[] = new int[n];

        // Loop through the net array, tracking all the changes of price day by day
        for(int i = 0; i < n - 1; i++){
            net[i] = prices[i + 1] - prices[i];
        }

        // Establish an int to track maximum total profit
        int totalProfit = 0;

        // Loop through the net array, adding together all of the positive change values
        // This tracks all times where profit can be made by buying on one day and selling
        // on the next. Adding all this together gives the maximum possible profit
        for(int j = 0; j < n; j++){
            if(net[j] > 0){
                totalProfit += net[j];
            }
        }

        // Return the total profit
        return totalProfit;
    }
}