
import java.util.Scanner;


public class RaisingBacteria {

    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int result=0;
        while(n>0){
            result+=n%2;
            n/=2;
        }
        System.out.println(result);
    }
    
}
