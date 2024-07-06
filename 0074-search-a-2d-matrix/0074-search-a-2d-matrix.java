class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length,m=matrix[0].length-1;
        int i=0;
        while(i<n&&m>=0){
            if(matrix[i][m]==target) return true;
            else if(matrix[i][m]<target) i++;
            else m--;
        }
        return false;
    }
}