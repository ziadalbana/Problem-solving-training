package codeforces.b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PresidentsOffice {
    // wrong
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        char s =st.nextToken().charAt(0);
        String[] room=new String[n];
        int count=0;
        boolean[][] visited=new boolean[n][m];
        for (int i = 0; i < n; i++) {
            room[i]= new StringTokenizer(br.readLine()).nextToken();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(!visited[i][j]&&room[i].charAt(j)==s){
                 count+=dfs(i,j,n,m,room,visited,s,0);
                }else{
                    visited[i][j]=true;
                }
            }
        }
        System.out.println(count);

    }
    static int dfs(int i,int j,int n,int m,String[] arr,boolean[][] visited,char s,int count){
        if(i<0||i>=n||j<0||j>=m) return count;
        if(visited[i][j]) return count ;
        visited[i][j]=true;
        if(arr[i].charAt(j)==s&&arr[i].charAt(j)=='.')return count;
        else count=1;
        dfs(i,j-1,n,m,arr,visited,s,count);
        dfs(i,j+1,n,m,arr,visited,s,count);
        dfs(i+1,j,n,m,arr,visited,s,count);
        dfs(i-1,j,n,m,arr,visited,s,count);
        return count;
    }
}
