class Solution {
public int[][] generateMatrix(int n) {
        int[][] res=new int[n][n];
        int layers=(n+1)/2;
        int counter=1;
        for(int i=0;i<layers;i++){
            int row=i,col=i;
            int size=(n-1)-(2*i);
            if(size==0){
                res[row][col]=counter;
                break;
            }
            //right
            for(int j=0;j<size;j++) res[row][col++]=counter++;
            //down
            for(int j=0;j<size;j++) res[row++][col]=counter++;
            //left
            for(int j=0;j<size;j++) res[row][col--]=counter++;
            //up
            for(int j=0;j<size;j++) res[row--][col]=counter++;
        }
        return res;
    }
}