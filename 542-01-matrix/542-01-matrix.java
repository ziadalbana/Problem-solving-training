class Solution {
    public int[][] updateMatrix(int[][] mat) {
        if (mat == null || mat.length == 0 || mat[0].length == 0) {
            return mat;
        }

        int rows = mat.length;
        int cols = mat[0].length;
        if (rows == 1 && cols == 1) {
            return mat;
        }

        int[][] result = new int[rows][cols];
        // (rows + cols - 1) is the maximum possible distance in the matrix. Its the
        // distance been two diagonally opposite corners.
        int maxDistance = rows + cols;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 0) {
                    continue;
                }
                result[i][j] = maxDistance;
                if (i > 0) {
                    result[i][j] = Math.min(result[i][j], result[i - 1][j] + 1);
                }
                if (j > 0) {
                    result[i][j] = Math.min(result[i][j], result[i][j - 1] + 1);
                }
            }
        }

        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j >= 0; j--) {
                if (mat[i][j] == 0) {
                    continue;
                }
                if (i < rows - 1) {
                    result[i][j] = Math.min(result[i][j], result[i + 1][j] + 1);
                }
                if (j < cols - 1) {
                    result[i][j] = Math.min(result[i][j], result[i][j + 1] + 1);
                }
            }
        }

        return result;
    }
}


// import java.awt.*;
// class Solution {
//      public int[][] updateMatrix(int[][] mat) {
//         int m=mat.length;
//         int n=mat[0].length;
//         int[][] result=new int[m][n];
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 if (mat[i][j]==0) result[i][j]=0;
//                 else result[i][j]=bfs(mat,i,j);
//             }
//         }
//       return result;
//     }
//     private int bfs(int[][] mat,int x,int y){
//         int[][] near=new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
//         Queue<Integer> q1= new LinkedList<>();
//         Queue<Integer> q2=new LinkedList<>();
//         q1.add(x);
//         q2.add(y);
//         while(!q1.isEmpty()){
//             int q1X=q1.poll();
//             int q2X= q2.poll();
//             for (int i = 0; i < 4; i++) {
//                 int tempX=  (q1X+near[i][0]);
//                 int tempY=  (q2X+near[i][1]);
//                 if (tempX>=0&&tempX<mat.length&&tempY>=0&&tempY<mat[0].length) {
//                     if (mat[tempX][tempY] == 0) return Math.abs(tempX-x)+Math.abs(tempY-y);
//                     else {
//                         q1.add(tempX);
//                         q2.add(tempY);
//                     }
//                 }
//             }
//         }
//         return -1;
//     }
    // private int bfs(int[][] mat,int x,int y){
    //     int[][] near=new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
    //     Queue<Integer> q1= new LinkedList<>();
    //     Queue<Integer> q2=new LinkedList<>();
    //     q1.add(x);
    //     q2.add(y);
    //     while(!q1.isEmpty()){
    //         int q1X=q1.poll();
    //         int q2X= q2.poll();
    //         for (int i = 0; i < 4; i++) {
    //             int tempX=  (q1X+near[i][0]);
    //             int tempY=  (q2X+near[i][1]);
    //             if (tempX>=0&&tempX<mat.length&&tempY>=0&&tempY<mat[0].length) {
    //                 if (mat[tempX][tempY] == 0) return Math.abs(tempX-x)+Math.abs(tempY-y);
    //                 else {
    //                     q1.add(tempX);
    //                     q2.add(tempY);
    //                 }
    //             }
    //         }
    //     }
    //     return -1;
    // }
