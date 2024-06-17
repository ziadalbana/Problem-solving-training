class Solution {
    public void setZeroes(int[][] matrix) {
      int n=matrix.length,m=matrix[0].length;
      boolean[][] visited=new boolean[n][m];
      for(int i=0;i<n;i++){
          for(int j=0;j<m;j++){
              if(matrix[i][j]==0&&!visited[i][j]){
                  visited[i][j]=true;
                  setRowAndCol(matrix,visited,i,j);
              }
          }
      }
    }
    
    private void setRowAndCol(int[][] matrix,boolean[][] visited,int x,int y){
        int n=matrix.length,m=matrix[0].length;
        //row iteration
        for(int i=0;i<m;i++){
            if(matrix[x][i]!=0&&!visited[x][i]){
              visited[x][i]=true;
              matrix[x][i]=0;
            }
        }
        // col Iteration
        for(int i=0;i<n;i++){
            if(matrix[i][y]!=0&&!visited[i][y]){
              visited[i][y]=true;
              matrix[i][y]=0;
            }
        }
    }
}