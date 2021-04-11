
package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class SerialTime {

    static boolean[][][] visited;
    static int count=0;
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s = new StringTokenizer(in.readLine());
        int k = Integer.parseInt(s.nextToken());
        int n = Integer.parseInt(s.nextToken());
        int m = Integer.parseInt(s.nextToken());
        int i,j,l;
        char c;
        String str;
       visited=new boolean[k][n][m];
        for(i=0;i<k;i++){
            new StringTokenizer(in.readLine());
            for(j=0;j<n;j++){
                s = new StringTokenizer(in.readLine());
                str=s.nextToken();
                for(l=0;l<m;l++){
                    c=str.charAt(l);
                    if(c=='#'){
                        visited[i][j][l]=true;
                    }
                }
            }
        }
        new StringTokenizer(in.readLine());
        s = new StringTokenizer(in.readLine());
        int x=Integer.parseInt(s.nextToken())-1;
        int y=Integer.parseInt(s.nextToken())-1;
        dfs(0,x,y,n,m,k);
        System.out.println(count);
    }
    
    public static void dfs(int z, int x,int y,int n,int m,int k){
        if(z<0||z>=k||x<0||x>=n||y<0||y>=m) return;
        if(visited[z][x][y]) return;
        visited[z][x][y]=true;
        count++;
        dfs(z-1,x,y,n,m,k);
        dfs(z+1,x,y,n,m,k);
        dfs(z,x+1,y,n,m,k);
        dfs(z,x-1,y,n,m,k);
        dfs(z,x,y-1,n,m,k);
        dfs(z,x,y+1,n,m,k);
    }
    
    
}
