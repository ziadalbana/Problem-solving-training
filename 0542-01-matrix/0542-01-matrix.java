class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[][] dp = new int[n][m];
        int maxPossible=n+m-2;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==1){
                    int upCell=(i>0) ? dp[i-1][j]:maxPossible;
                    int leftCell=(j>0) ? dp[i][j-1]:maxPossible;
                    dp[i][j]=Integer.min(upCell,leftCell)+1;
                }
            }
        }
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                if(mat[i][j]==1){
                    int downCell=(i<n-1) ? dp[i+1][j]:maxPossible;
                    int rightCell=(j<m-1) ? dp[i][j+1]:maxPossible;
                    int temp= Integer.min(downCell,rightCell)+1;
                    dp[i][j]=Integer.min(dp[i][j],temp);
                }
            }
        }
        return dp;

    }
}