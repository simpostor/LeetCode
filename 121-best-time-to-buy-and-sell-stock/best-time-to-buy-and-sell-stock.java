class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int n = prices.length;
        int maxp = 0;
        for(int r = 1; r < n; r++){
            int profit = prices[r] - prices[l];
            if(profit < 0)l = r;
            maxp = Math.max(maxp,profit);

        }
        return maxp;
    }
}