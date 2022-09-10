class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
      int m=image[0].length-1;
      for(int[]row:image){
        for(int i=0;i<=m/2;i++){
          int temp=row[i];
          row[i]=row[m-i]^1;
          row[m-i]=temp^1;
        }
      }
      return image;
    }
}