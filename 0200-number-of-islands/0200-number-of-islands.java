class Solution {
public int numIslands(char[][] grid) {
            int m=grid.length;
            int n=grid[0].length;
            int count=0;
            boolean[][] visited=new boolean [m][n] ;
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(!visited[i][j]&&grid[i][j]=='1'){
                        count++;
                        dfs(i,j,grid,visited);
                    }
                }
            }
            return count;
        }
        void dfs(int x,int y,char[][] image,boolean[][] visited){
            if(x<0||x>=image.length||y<0||y>=image[x].length) return ;
            if(visited[x][y])return ;
            visited[x][y]=true;
            if(image[x][y]=='0') return ;
            dfs(x+1,y,image,visited);
            dfs(x-1,y,image,visited);
            dfs(x,y+1,image,visited);
            dfs(x,y-1,image,visited);
        }
}