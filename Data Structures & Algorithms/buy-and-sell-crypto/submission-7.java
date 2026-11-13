class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int maxProfit = 0;
        // if(len == 1){
        //     return 0;
        // }
        int l = 0;
        int r = 1;
        while(r < len){
            int profit = prices[r] - prices[l];
            if(profit <= 0){
                l = r;
            }else{
                maxProfit = Math.max(profit, maxProfit);
            }
            r++;
        }
        return maxProfit;
    }
}
