class Solution {
    public int maxProfit(int[] prices) {
        int left_index = 0;
        int right_index = 1;
        int max = 0;

        while(right_index < prices.length){
            if(prices[left_index] < prices[right_index]){
                max = Math.max(max, prices[right_index] - prices[left_index]);
            }
            else {
                left_index = right_index;
            }

            right_index++;
        }

        return max;
    }
}