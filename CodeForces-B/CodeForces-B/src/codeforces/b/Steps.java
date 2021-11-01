package codeforces.b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Steps {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n=Long.parseLong(st.nextToken());
        long m=Long.parseLong(st.nextToken());
        st = new StringTokenizer(br.readLine());
        pair intialIndex=new pair(Long.parseLong(st.nextToken()),Long.parseLong(st.nextToken()));
        ArrayList<pair> index=new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        int vectors=Integer.parseInt(st.nextToken());
        for (int i = 0; i < vectors; i++) {
            st = new StringTokenizer(br.readLine());
            long x=Long.parseLong(st.nextToken());
            long y=Long.parseLong(st.nextToken());
            index.add(new pair(x,y));
        }
        long result=0;
        for (int i = 0; i < vectors; i++) {
            pair temp=index.get(i);
            long step=0;
            long l=0,r=n*m,mid;
            while (l<=r) {
                mid=(l+r)/2;
                if (intialIndex.x + mid*temp.x > 0
                        && intialIndex.x + mid*temp.x <= n
                        && intialIndex.y + mid*temp.y > 0
                        && intialIndex.y + mid*temp.y <= m)
                {
                 step=mid;
                 l=mid+1;
                }else{
                    r=mid-1;
                }
            }
            result+=step;
            intialIndex.x+=step* temp.x;
            intialIndex.y+=step* temp.y;
        }
        System.out.println(result);
    }
    static class pair {
        long x,y;
        public pair(long x,long y){
            this.x=x;
            this.y=y;
        }
    }
}

