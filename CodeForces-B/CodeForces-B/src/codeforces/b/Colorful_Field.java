package codeforces.b;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;
public class Colorful_Field {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        int waste=Integer.parseInt(st.nextToken());
        int q=Integer.parseInt(st.nextToken());
        TreeSet<pair> wasteIndex=new TreeSet<>();
        for (int i = 0; i < waste; i++) {
            st = new StringTokenizer(br.readLine());
            int x=Integer.parseInt(st.nextToken());
            int y=Integer.parseInt(st.nextToken());
            wasteIndex.add(new pair(x,y));
        }
        int index=1;
        for (pair s:wasteIndex) {
            s.order=index++;
        }
        String[] fruits=new String[]{"Carrots ","Kiwis","Grapes"};
        int rotate=0;

        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());
            int x=Integer.parseInt(st.nextToken());
            int y=Integer.parseInt(st.nextToken());
            pair temp=wasteIndex.ceiling(new pair(x,y));
            if(temp==null) {
                index=(x-1)*m+(y-1);
                System.out.println(fruits[(index-waste) %3]);
            }
            else if(temp.x==x&&temp.y==y) System.out.println("Waste");
            else{
                int order= temp.order-1;
                 index=(x-1)*m+(y-1);
                System.out.println(fruits[(index-order)%3]);
            }

        }
    }

}
class pair implements Comparable<pair>{
    int x,y,order;
    public pair(int x,int y){
        this.x=x;
        this.y=y;
    }
    @Override
    public int compareTo(pair o) {
        if(x!=o.x) return x-o.x;
        return y-o.y;
    }
}
