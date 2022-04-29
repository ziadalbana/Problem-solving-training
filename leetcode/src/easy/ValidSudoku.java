package easy;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            if (!(isValidRow(board[i])&&isValidCol(board,i))) return false;
        }
        for (int i = 0; i < 9; i+=3) {
            for (int j = 0; j < 9; j+=3) {
                if (!blockCheck(board,i,j)) return false;
            }
        }
        return true;
    }
    private boolean isValidRow(char[] row){
        boolean[] num=new boolean[10];
        for (int i = 0; i <9 ; i++) {
            if(row[i]!='.') {
                if (num[row[i]-'0']) return false;
                num[row[i]-'0'] = true;
            }
        }
        return true;
    }
    private boolean isValidCol(char[][] col,int c){
        boolean[] num=new boolean[10];
        for (int i = 0; i <9 ; i++) {
            if(col[i][c]!='.') {
                if (num[col[i][c]-'0']) return false;
                num[col[i][c]-'0'] = true;
            }
        }
        return true;
    }
    private boolean blockCheck(char[][] block,int x,int y){
        boolean[] num=new boolean[10];
        for (int i = x; i < x+3; i++) {
            for (int j = y; j < y+3; j++) {
                if(block[i][j]!='.') {
                    if (num[block[i][j]-'0']) return false;
                    num[block[i][j]-'0'] = true;
                }
            }
        }
        return true;
    }
}
