
import java.util.ArrayList;
import java.util.Scanner;


public class AlyonaandNumbers {

    
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int count=0;
        int i,j;
        i=n/5;
        j=m/5;
        count=n*j+(m%5)*(i);
        System.out.println(count);
    }
    
}
