import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Combinations_369 {
    public static void main(String[] args) {
        Combinations_369 n=new Combinations_369();
        n.solution();

    }
    void solution(){
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (true) {
                StringTokenizer s = new StringTokenizer(in.readLine());
                int n=Integer.parseInt(s.nextToken());
                int m=Integer.parseInt(s.nextToken());
                if(n==0&&m==0) return;
                 ArrayList<Integer> up=new ArrayList<>();
                 ArrayList <Integer> down=new ArrayList<>();
                 up.add(1);down.add(1);
                 int sizeUp=1;
                 int sizedown=1;
                 long y=1;
                for (int i = n; i >n-m; i--) {
                    sizeUp=multi(up,i,sizeUp);
                }
                for (int i =m; i >0 ; i--) {
                    y*=i;
                }

                String result ;
                result=divide(up,y);
                System.out.println(n+" things taken "+ m +" at a time is "+result+" exactlyresult");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    int multi(ArrayList<Integer> arr,int num,int size ){
           int carry=0;
        for (int i = 0; i < size; i++) {
            int temp=arr.get(i)*num+carry;
            arr.set(i,temp%10);
            carry=temp/10;
        }
        while (carry!=0){
            arr.add(carry%10);
            carry/=10;
        }
        return arr.size();
    }
   String divide(ArrayList<Integer> arr1,long divisor){
     long carry=0;
       StringBuilder result=new StringBuilder();
       for (int i = 0; i < arr1.size(); i++) {
           long temp=arr1.get(i)+carry*10;
           result.append(temp/divisor);
           carry=temp%divisor;
       }
       for (int i = 0;i < result.length(); i++) {
           if (result.charAt(i) != '0') {
               // Return the result
               return result.substring(i);
           }
       }
       return null;
    }
}
