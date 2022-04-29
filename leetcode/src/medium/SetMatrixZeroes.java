package medium;

public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
       int n= matrix.length;
       int m=matrix[0].length;
       boolean[][] visited=new boolean[n][m];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j]&&matrix[i][j]==0){
                    visited[i][j]=true;
                    zeroOperation(matrix,i,j,visited);
                }
            }
        }
    }
    private void zeroOperation(int[][] matrix,int x,int y,boolean[][] visited){
        for (int i = 0; i < matrix[0].length; i++) {
            if (!visited[x][i]&&matrix[x][i]==0){
                visited[x][i]=true;
                zeroOperation(matrix,x,i,visited);
            }else if (!visited[x][i]&&matrix[x][i]!=0){
                visited[x][i]=true;
                matrix[x][i]=0;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            if (!visited[i][y]&&matrix[i][y]==0){
                visited[i][y]=true;
                zeroOperation(matrix,i,y,visited);
            }else if (!visited[i][y]&&matrix[i][y]!=0){
                visited[i][y]=true;
                matrix[i][y]=0;
            }
        }
    }
}
