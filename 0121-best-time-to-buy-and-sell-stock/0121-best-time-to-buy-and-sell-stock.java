class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int nowProfit=0;
        int maxProfit=0;
        for(int n:prices){
            min=Integer.min(min,n);
            nowProfit=n-min;
            maxProfit=Integer.max(maxProfit,nowProfit);
        }
        return maxProfit;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // int min=Integer.MAX_VALUE;
        // int nowprofit=0;
        // int bestProfit=0;
        // for (int i = 0; i <prices.length; i++) {
        //     min=Math.min(min,prices[i]);
        //     nowprofit=prices[i]-min;
        //     bestProfit=Math.max(bestProfit,nowprofit);
        // }
        // return bestProfit;
    }
}