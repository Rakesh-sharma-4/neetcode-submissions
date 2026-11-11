class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int maxProfit = Integer.MIN_VALUE;
        for(int i =0;i<len;i++){
            int profit = 0;
            for(int j = i;j<len;j++){
                profit = prices[j] - prices[i];
                maxProfit = Math.max(profit, maxProfit);
            }
        }
        return maxProfit;
    }
}
