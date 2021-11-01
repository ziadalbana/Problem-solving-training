package codeforces.b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class StudentsandShoelaces {
    public static void main(String[] args) throws IOException {
        //Hashtable<Integer, List<Integer>> graph=new Hashtable<>();
        ArrayList<LinkedList<Integer>> graph=new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) {
            graph.add(new LinkedList<>());
        }
        for (int i = 0; i <m; i++) {
            st = new StringTokenizer(br.readLine());
            int to=Integer.parseInt(st.nextToken())-1;
            int from=Integer.parseInt(st.nextToken())-1;
            graph.get(to).add(from);
            graph.get(from).add(to);
        }
        boolean deleted=true;
        boolean flag =false;
        int outStudent;
        int countGroups=0;
        while(deleted){
            outStudent=0;
            Queue<Integer> second=new LinkedList<>();
            flag =false;
            for (int i= 0; i<graph.size() ; i++) {
                int index=i;
                if (graph.get(index).size() == 1) {
                    int temp = graph.get(index).get(0);
                    graph.get(index).remove((Object)temp);
                    second.add(temp);
                    second.add(index);
                    //graph.get(temp).remove((Object)index);
                    flag = true;
                    deleted = true;
                    outStudent++;
                }
            }
            while (!second.isEmpty()){
                graph.get(second.poll()).remove((Object)second.poll());
            }
            if (!flag) deleted=false;
            if (outStudent>0) countGroups++;
        }
        System.out.println(countGroups);

    }
}
