class Solution {
     public int uniquePaths(int m, int n) {
         int[][] meme=new int [m][n];
         for(int i=0;i<m;i++){
             meme[i][0]=1;
         }
         for(int i=0;i<n;i++){
             meme[0][i]=1;
         }
         for(int i=1;i<m;i++){
             for(int j=1;j<n;j++){
                 meme[i][j]=meme[i-1][j]+meme[i][j-1];
             }
         }
       return meme[m-1][n-1];     
     }
    // public int uniquePaths(int m, int n) {
    //    //  Queue<int[]> queue=new LinkedList<>();
    //    //  queue.add(new int[]{0,0});
    //    //  int[][] dirc=new int[][]{{1,0},{0,1}};
    //    //  int count=0;
    //    //  while(!queue.isEmpty()){
    //    //      int[] temp=queue.poll();
    //    //      if(temp[0]==m-1&&temp[1]==n-1) count++;
    //    //      for(int i=0;i<2;i++){
    //    //          int x=temp[0]+dirc[i][0];
    //    //          int y=temp[1]+dirc[i][1];
    //    //          if(x<m&&y<n)  queue.add(new int[]{x,y});
    //    //      }
    //    //  }
    //    // return count;
    // }
}