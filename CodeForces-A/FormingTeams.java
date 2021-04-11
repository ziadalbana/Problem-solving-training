
package javaapplication22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class FormingTeams {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s = new StringTokenizer(in.readLine());
        int n=Integer.parseInt(s.nextToken());
        int m=Integer.parseInt(s.nextToken());
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
        int i;
        for(i=0;i<m;i++){
            graph.add(i,new ArrayList<Integer>());
        }
        for(i=0;i<m;i++){
            s = new StringTokenizer(in.readLine());
            int x=Integer.parseInt(s.nextToken());
            int y=Integer.parseInt(s.nextToken());
            graph.get(x).add(y);
            graph.get(y).add(x);
        }
        
    }
    
}
