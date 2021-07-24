import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main2 {
      public static void main(String[] args) {
         Main2 n=new Main2();
         n.solution();
     }
     void solution(){
         BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
         try {
             while (true) {
                 int count=0;
                 StringTokenizer s = new StringTokenizer(in.readLine());
                 int size=Integer.parseInt(s.nextToken());
                 if(size==0) return;
                 int[] arr=new int[size];
                 for (int i = 0; i < size; i++) {
                     s = new StringTokenizer(in.readLine());
                     arr[i]=Integer.parseInt(s.nextToken());
                 }
                 for (int i = 0; i < size; i++) {
                     for (int j = i+1; j < size; j++) {
                             int result=gcd(Integer.max(arr[i],arr[j]),Integer.min(arr[i],arr[j]));
                             if(result==1){
                                 count++;
                            }
                     }
                 }
                 if (count==0)System.out.println("No estimate for this data set.");
                 else{
                     int n=(size*(size-1))/2;
                     double result=Math.sqrt((6.000000*n)/count);
                     System.out.printf("%.6f\n",result);
                 }

             }
         } catch (Exception e) {
             e.printStackTrace();
         }

     }
    int gcd(int x,int y){
         int a=x;
         int b=y;
         while(b!=0){
             int r=a%b;
             a=b;
             b=r;
         }
         return a;
    }
}
