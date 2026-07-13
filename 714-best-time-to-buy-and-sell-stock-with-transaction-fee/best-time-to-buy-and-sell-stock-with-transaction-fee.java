class Solution {

    int[][] dp = new int[50001][2];

    private int maxP(int[] prices, int day, int n, int buy, int fee) {

        if (day >= n) {
            return 0;
        }

        if (dp[day][buy] != -1) {
            return dp[day][buy];
        }

        int profit;

        if (buy == 1) {
            // Buy
            int consider = maxP(prices, day + 1, n, 0, fee) - prices[day];
            int notConsider = maxP(prices, day + 1, n, 1, fee);

            profit = Math.max(consider, notConsider);
        } else {
            // Sell
            int consider = maxP(prices, day + 1, n, 1, fee) + prices[day] - fee;
            int notConsider = maxP(prices, day + 1, n, 0, fee);

            profit = Math.max(consider, notConsider);
        }

        return dp[day][buy] = profit;
    }

    public int maxProfit(int[] prices, int fee) {

        int n = prices.length;

        for (int i = 0; i <= n; i++) {
            java.util.Arrays.fill(dp[i], -1);
        }

        return maxP(prices, 0, n, 1, fee);
    }
}