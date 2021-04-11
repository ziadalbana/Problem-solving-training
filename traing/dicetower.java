
import java.util.Scanner;


public class dicetower {

   
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int top=in.nextInt();
        int[] order=new int[n*2];
        int i;
        String ans="YES";
        for(i=0;i<n;i++){
            int right=in.nextInt();
            int left=in.nextInt();
            if(top==right||top==7-right||top==left||top==7-left){
                ans="NO";
                break;
            }
        }
        System.out.println(ans);
    }
    
}
