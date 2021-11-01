package codeforces.b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class OlympicMedal {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int i=0;
        int n=Integer.parseInt(st.nextToken());
        ArrayList<Integer> x=new ArrayList<>();
        for (i = 0; i < n; i++) {
             x.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        int m=Integer.parseInt(st.nextToken());
        ArrayList<Integer> y=new ArrayList<>();
        for (i = 0; i < m; i++) {
            y.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        int k=Integer.parseInt(st.nextToken());
        ArrayList<Integer> z=new ArrayList<>();
        for (i = 0; i < k; i++) {
            z.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        double maxR=Double.MIN_VALUE;
        int xMax= Collections.max(x);
        int yMax=Collections.max(y);
        int zmin=Collections.min(z);
        double result=(b*yMax*Math.pow(xMax,2))/(a*zmin+b*yMax);
        result=Math.sqrt(result);
        System.out.println(result);
    }
}
