class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean[][] visited=new boolean[isConnected.length][isConnected.length];
        int count=0;
        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<isConnected[0].length;j++){
                if(!visited[i][j]&&isConnected[i][j]==1) {
                    visited[i][j]=true;
                    dfs(isConnected,visited,j,i);
                    count++;
                }
            }
        }
        return count;
    }
    private void dfs(int[][] isConnected,boolean[][] visited,int x,int y){
        visited[x][y]=true;
        for (int j = 0; j < isConnected.length; j++) {
            if(!visited[x][j]&&isConnected[x][j]==1){
                visited[x][j]=true;
                dfs(isConnected,visited,j,x);
            }
        }
    }
}