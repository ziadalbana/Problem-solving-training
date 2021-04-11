
package traing;

import java.util.Arrays;
import java.util.Scanner;


public class Twins {

    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int[] coins=new int[num];
        int i;
        int sum=0;
        int son=0;
        for(i=0;i<num;i++){
            coins[i]=in.nextInt();
            sum+=coins[i];
        }
        Arrays.sort(coins);
        for(i=num-1;i>0;i--){
            son+=coins[i];
            if(son>sum/2){
                break;
            }
        }
        System.out.println(num-i);
    }
    
}
