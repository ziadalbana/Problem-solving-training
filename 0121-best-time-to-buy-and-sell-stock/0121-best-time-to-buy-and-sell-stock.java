class Solution {
    public int maxProfit(int[] prices) {
        int profit=Integer.MIN_VALUE;
        int minBuy=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            minBuy=Integer.min(minBuy,prices[i]);
            int current=prices[i]-minBuy;
            profit=Integer.max(profit,current);
        }
        return profit;
    }
}