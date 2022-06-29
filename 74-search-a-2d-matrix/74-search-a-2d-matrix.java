class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m;i++){
            int[] temp=matrix[i];
            if(target<=temp[n-1]){
                return  binarySearch(temp,target);
            }
        }
        return false;
    }
    private boolean binarySearch(int[] row, int target){
           int l=0;int r=row.length-1;
            while(l<=r){
              int mid=(l+r)/2;
                if(row[mid]==target) return true;
                else if(row[mid]<target) l=mid+1;
                else r=mid-1;
            }
        return false;
    }
}