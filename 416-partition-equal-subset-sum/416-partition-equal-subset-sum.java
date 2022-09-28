class Solution {
    public boolean canPartition(int[] num) {
      int sum=0;
        for(int n:num) sum+=n;
        if(sum%2!=0) return false;
        sum/=2;
        int n=num.length;
        boolean[][] dp=new boolean[n][sum+1];
        for (int i = 0; i < n; i++) dp[i][0]=true;
        for (int i = 1; i < sum+1; i++) dp[0][i]=(num[0]==i) ?true: false;
        for(int i=1;i<n;i++){
            for(int j=1;j<sum+1;j++){
              if (dp[i-1][j]) dp[i][j]=dp[i-1][j];
              else if (num[i]<=j) dp[i][j]=dp[i-1][j-num[i]];
            }
        }
        return dp[n-1][sum];
    }
}