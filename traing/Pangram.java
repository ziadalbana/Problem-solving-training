
package traing;

import java.util.Scanner;


public class Pangram {

    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int size=in.nextInt();
        String word=in.next().toLowerCase();
        int result=0;
        if(size>=26){
        for (int i=0;i<size;i++){
            if(word.charAt(i)>=97&&word.charAt(i)<=122&&word.charAt(i)!=' '){
              result++;
              word=word.replace(word.charAt(i),' ');
        
        }
            
        }
        }
        if(result==26){
        System.out.println("YES");
        }else{
             System.out.println("NO");
        }
        
    }
    
}
