class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
     int i=0,j=matrix[0].length-1;
     while(i<matrix.length&&j>=0){
         int num=matrix[i][j];
         if(num==target) return true;
         else if(num<target) i++;
         else j--;
     }
        return false;
    }
}