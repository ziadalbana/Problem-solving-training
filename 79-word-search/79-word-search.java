class Solution {
    public  boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==word.charAt(0)){
                    if(checker(board,new boolean[n][m],word,i,j,0,"")) return true;
                }
            }
        }
        return false;
    }
    private boolean checker(char[][] board,boolean[][] visited, String word,int x,int y,int pos,String temp){
        if(x<0||x>=board.length||y<0||y>=board[0].length) return false;
        if(visited[x][y]||board[x][y]!= word.charAt(pos)) return false;
        temp+=board[x][y];
        if (temp.equals(word)) return true;
        visited[x][y]=true;
        boolean state=checker(board,visited,word,x+1,y,pos+1,temp)||
                checker(board,visited,word,x-1,y,pos+1,temp)||
                checker(board,visited,word,x,y+1,pos+1,temp)||
                checker(board,visited,word,x,y-1,pos+1,temp);
        if (state) return true;
        else visited[x][y]=false;
        return false;
    }
}