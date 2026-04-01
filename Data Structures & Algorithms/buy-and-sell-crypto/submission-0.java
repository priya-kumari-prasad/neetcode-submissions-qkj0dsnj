class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int bestBuy = prices[0];
        for(int i = 1; i<prices.length;i++){
            if(prices[i] > bestBuy){
                max = Math.max(max, prices[i]-bestBuy);
            }
            bestBuy = Math.min(bestBuy, prices[i]);
        }
        return max;
    }
}
