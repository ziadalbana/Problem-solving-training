package medium;

public class WordSearch {
    public static void main(String[] args) {
      exist(new char[][]{{'C','A','A'},{'A','A','A'},{'B','C','D',}},"AAB");
    }
    public static boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                boolean status=false;
                if (board[i][j]==word.charAt(0)){
                    status=getWord(i,j,board,word);
                }
                if (status) return true;
            }
        }
        return false;
    }
    private static boolean getWord(int x,int y,char[][] board, String word){
        int[] oldpostion=new int[]{x,y};
        int[] currentpostion=new int[]{oldpostion[0],oldpostion[1]};
        int[] temp=new int[]{oldpostion[0],oldpostion[1]};
        for (int i = 1; i <word.length() ; i++) {
            searchLetter(currentpostion[0],currentpostion[1],board,word.charAt(i),currentpostion,temp);
            if(oldpostion[0]==currentpostion[0]&&oldpostion[1]==currentpostion[1]) return false;
            temp[0]=oldpostion[0];
            temp[1]=oldpostion[1];
            oldpostion[0]=currentpostion[0];
            oldpostion[1]=currentpostion[1];
        }
        return true;
    }
    private static void searchLetter(int x,int y,char[][] board, char c,int[] postion,int[] oldpostion){
        if(checkLeter(x+1,y,board,c,postion,oldpostion))return;
        if(checkLeter(x-1,y,board,c,postion,oldpostion)) return;
        if(checkLeter(x,y+1,board,c,postion,oldpostion)) return;
        if(checkLeter(x,y-1,board,c,postion,oldpostion))return;
    }
    private static boolean  checkLeter(int x, int y, char[][] board, char c, int[] postion,int[] oldpostion){
        if(x<0||x>= board.length||y<0||y>=board[0].length) return false;
        if((oldpostion[0]!=x||oldpostion[1]!=y)&&board[x][y]==c) {
            postion[0]=x;postion[1]=y;
            return true;
        };
        return false;
    }
}
