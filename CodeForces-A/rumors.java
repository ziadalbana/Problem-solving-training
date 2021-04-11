
package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class rumors {

    static ArrayList<Integer>[] adj_list;
    static boolean[] visited;
    static  long[] cost;
    static Long sum=(long)0,min=(long)0;
    public static void main(String[] args) throws IOException {
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer s = new StringTokenizer(in.readLine());
      int v=Integer.parseInt(s.nextToken());
      int e=Integer.parseInt(s.nextToken());
      int i;
      adj_list=new ArrayList[v+1];
      visited=new boolean[v+1];
      cost=new long[v+1];
      s = new StringTokenizer(in.readLine());
      for(i=1;i<=v;i++){
            cost[i]= Integer.parseInt(s.nextToken());
            adj_list[i]=new ArrayList<>();
        }
        for( i=0;i<e;i++){
             s = new StringTokenizer(in.readLine());
            int start=Integer.parseInt(s.nextToken());
            int end=Integer.parseInt(s.nextToken());
            adj_list[start].add(end);
            adj_list[end].add(start);
        }
        for ( i = 1; i < adj_list.length; i++) {
             if(!visited[i]){
                 min=cost[i];
                 dfs(i);
                 sum+=min;
                }
        }
        System.out.println(sum);
        
    }
  
         
    public static void dfs(int node){
        visited[node] = true;
        for (int j = 0; j < adj_list[node].size(); j++) {
            int child = adj_list[node].get(j);
            if (!visited[child]) {
                if(min>cost[child]){
                    min=cost[child];
                }
                dfs(child);
            }
        }
        
    }   
    
}
