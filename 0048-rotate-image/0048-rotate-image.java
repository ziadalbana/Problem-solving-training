class Solution {
public void rotate(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int levels=(n+1)/2;
        for(int i=0;i<levels;i++){
            int cols=m-(2*i)-1;
            for(int j=i;j<cols+i;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[n-j-1][i];
                matrix[n-j-1][i]=matrix[n-i-1][m-j-1];
                matrix[n-i-1][m-j-1]=matrix[j][m-i-1];
                matrix[j][m-i-1]=temp;
            }
        }
    }
}