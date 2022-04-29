package febChallenge;

import java.util.Arrays;

public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {
        BestTimetoBuyandSellStock n=new BestTimetoBuyandSellStock();
        System.out.println((n.maxProfit(new int[]{2,4,1})));
    }
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int nowprofit=0;
        int bestProfit=0;
        for (int i = 0; i <prices.length; i++) {
            min=Math.min(min,prices[i]);
            nowprofit=prices[i]-min;
            bestProfit=Math.max(bestProfit,nowprofit);
        }
        return bestProfit;
    }
}
