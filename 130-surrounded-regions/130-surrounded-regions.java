class Solution {
    public void solve(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        boolean[][] visited=new boolean[n][m];
        for(int i=0;i<m;i++){
            dfs(board,visited,0,i,true);
            dfs(board,visited,n-1,i,true);
        }
        for(int i=0;i<n;i++){
            dfs(board,visited,i,0,true);
            dfs(board,visited,i,m-1,true);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
              if(board[i][j]=='O') 
                   dfs(board,visited,i,j,false);
            }
        }
        
    }
    private void dfs(char[][] board,boolean[][] visited,int x,int y,boolean boarder){
        if(x>=board.length||x<0||y>=board[0].length||y<0) return;
        if(board[x][y]=='X'||visited[x][y]) return;
        if(!boarder) board[x][y]='X';
        visited[x][y]=true;
        dfs(board,visited,x+1,y,boarder);
        dfs(board,visited,x-1,y,boarder);
        dfs(board,visited,x,y+1,boarder);
        dfs(board,visited,x,y-1,boarder);
    }
}