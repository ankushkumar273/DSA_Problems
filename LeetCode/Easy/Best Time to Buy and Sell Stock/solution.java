class Solution {
    public int maxProfit(int[] prices) {
        int buyprices = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++){
            if(prices[i]>buyprices){
                int profit = prices[i] - buyprices;
                maxProfit = Math.max(profit, maxProfit);
            }else{
                buyprices = prices[i];
            }
        }
        return maxProfit;
    }
}