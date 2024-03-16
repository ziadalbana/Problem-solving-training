class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length,m=matrix[0].length;
        boolean[][] changed =new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0&&!changed[i][j])
                    setZero(i,j,matrix,changed);
            }
        }  
    }
    private void setZero(int x,int y,int[][] matrix,boolean[][] changed){
        int n=matrix.length,m=matrix[0].length;
        changed[x][y]=true;
        // row iteration
        for(int i=0;i<m;i++){
            if(!changed[x][i]&&matrix[x][i]!=0) {
                matrix[x][i]=0;
                changed[x][i]=true;
            }
        }
        for(int i=0;i<n;i++){
            if(!changed[i][y]&&matrix[i][y]!=0) {
                matrix[i][y]=0;
                changed[i][y]=true;
            }
        }
    }
}