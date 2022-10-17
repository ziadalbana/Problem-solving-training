class Solution {
    //version 1
    // public int maxProfit(int[] prices) {
    //     int profit=0;
    //     for(int i=1;i<prices.length;i++){
    //         profit+=Integer.max(prices[i]-prices[i-1],0);
    //     }
    //     return profit;
    // }
    // version 2
    public int maxProfit(int[] prices) {
        int i=0,profit=0;
        int buy,sell;
        while(i<prices.length-1){
            while(i<prices.length-1&&prices[i]>=prices[i+1]) i++;
            buy=prices[i];
            while(i<prices.length-1&&prices[i]<=prices[i+1]) i++;
            sell=prices[i];
            profit+=sell-buy;
        }
        return profit;
        
    }
}