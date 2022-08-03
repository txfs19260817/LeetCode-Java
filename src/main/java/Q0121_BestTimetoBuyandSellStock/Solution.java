package Q0121_BestTimetoBuyandSellStock;

class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0, rightMax = prices[prices.length - 1];
        for (int i = prices.length - 2; i >= 0; i--) {
            profit = Math.max(profit, rightMax - prices[i]);
            rightMax = Math.max(rightMax, prices[i]);
        }
        return profit;
    }
}