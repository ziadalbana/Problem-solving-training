
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class GoodNumber {

    
    public static void main(String[] args) throws IOException {
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer s = new StringTokenizer(in.readLine());
       int n=Integer.parseInt(s.nextToken());
       int num=Integer.parseInt(s.nextToken());
       int i,result=0;
       String[] numbers=new String[n];
       for(i=0;i<n;i++){
           s = new StringTokenizer(in.readLine());
           numbers[i]=s.nextToken();
       }
       for(i=0;i<n;i++){
           int count=0;
           boolean[] visited=new boolean[num+1];
           for(int j=0;j<numbers[i].length();j++){
               int postion=(numbers[i].charAt(j))-48;
               if(postion<=num&&!visited[postion]){
                   count++;
                   visited[postion]=true;
               }
           }
           if(count==num+1){
               result++;
           }
       }
       System.out.println(result);
        
    }
    
}
