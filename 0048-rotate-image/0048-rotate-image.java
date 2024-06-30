class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int moves=n/2;
        int size=n;
        for(int i=0;i<moves;i++){
            for(int j=i;j<size-1;j++){
                 // temp first in iteration corner top
                int temp=matrix[i][j];
                // swap cornerdownleft with corner up left
                matrix[i][j]=matrix[n-1-j][i];
                // swap corener down right with corener down left
                matrix[n-1-j][i]=matrix[n-1-i][n-1-j];
                // swap corener up right with corener down right
                matrix[n-1-i][n-1-j]=matrix[j][n-1-i];
                // swap corener up left with corener up right
                matrix[j][n-1-i]=temp;
            }
            size--;
        }
    }
}