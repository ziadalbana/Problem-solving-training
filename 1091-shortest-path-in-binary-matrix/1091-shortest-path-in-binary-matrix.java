class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        Queue<int[]> queue=new LinkedList<>();
        queue.add(new int[]{0,0});
        int n=grid.length;
        int m=grid[0].length;
        if(grid[0][0]==1 || grid[n-1][m-1]==1) return -1;
        boolean[][] visited=new boolean[n][m];
        visited[0][0]=true;
        int count=1;
        int[][] neighbours= new int[][]{{-1,0},{1,0},{0,-1},{0,1},{-1,-1},{-1,1},{1,-1},{1,1}};
        while(!queue.isEmpty()){
            int levelSize=queue.size();
            for(int j=0;j<levelSize;j++){
            int[] curr=queue.poll();
            if(curr[0]==n-1&&curr[1]==m-1) return count;
                for(int i=0;i<8;i++){
                    int x=curr[0]+neighbours[i][0];
                    int y=curr[1]+neighbours[i][1];
                    if(x<0||x>=n||y<0||y>=m) continue;
                    if(grid[x][y]!=0 || visited[x][y]) continue;
                    queue.add(new int[]{x,y});
                    visited[x][y]=true;
                }
            }
            count++;
        }
        return -1;
    }
}