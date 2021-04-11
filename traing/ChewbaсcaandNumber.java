
import java.util.Scanner;


public class ChewbaсcaandNumber {

   
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       String num=in.next();
       char[] temp=num.toCharArray();
       for(int i=0;i<temp.length;i++){
           if(temp[i]>=53){
               temp[i]=(char) (57-temp[i]);
           }
       }
       String result=new String(temp);
       System.out.println(result);
    }
    
}
