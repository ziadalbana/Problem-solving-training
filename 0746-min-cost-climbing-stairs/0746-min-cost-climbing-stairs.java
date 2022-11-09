class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[] dp=new int[n+1];
        dp[n]=0;
        dp[n-1]=cost[n-1];
        for(int i=n-2;i>=0;i--){
            dp[i]=cost[i]+Integer.min(dp[i+1],dp[i+2]);
        }
        return Integer.min(dp[1],dp[0]);
    }
}