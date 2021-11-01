package codeforces.b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class FilyaandHomework {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        TreeSet<Integer> set=new TreeSet();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }
        if(set.size()<3){
            System.out.println("YES");
            return;
        }else if(set.size()>3){
            System.out.println("NO");
            return;
        };
        int diff=Math.abs(set.pollFirst()-set.first());
        int temp=Math.abs(set.pollFirst()-set.first());
        if (diff!=temp) {
                System.out.println("NO");
                return;
        }

        System.out.println("YES");
    }
}
