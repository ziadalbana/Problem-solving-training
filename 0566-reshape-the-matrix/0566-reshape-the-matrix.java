class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n=mat.length,m=mat[0].length;
        if(n*m!=r*c) return mat;
        int[][] res=new int[r][c];
        int x=0,y=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(x<r&&y<c) res[x][y++]=mat[i][j];
                if(y>=c) {
                    x++;y=0;
                }
            }
        }
        return res;
    }
}