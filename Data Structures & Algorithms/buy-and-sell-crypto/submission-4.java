class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0;
        int sell = 1;
        int max = 0;

        while(sell < prices.length){
            if(prices[sell] > prices[buy]){
                int profit = prices[sell]-prices[buy];
                max = Math.max(profit, max);
            } else {
                buy = sell;
                sell++;
                continue;
            }
            sell++;
        }
        return max;
    }
}
