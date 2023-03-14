class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int buy=Integer.MAX_VALUE;
        for(int price:prices){
            buy=Integer.min(buy,price);
            maxProfit=Integer.max(maxProfit,price-buy);
        }
        return maxProfit;
    }
}