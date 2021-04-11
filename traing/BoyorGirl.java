
package traing;

import java.util.Scanner;




public class BoyorGirl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String word;
        int sum=0;
        Scanner in=new Scanner(System.in);
        word=in.next();
        char[] word1=word.toCharArray();
        for (int i=0;i<word1.length;i++){
            for(int j=1+i;j<word1.length;j++){
                if((word1[i]==word1[j])&&word1[i]!=' '){
                    sum+=1;
                    word1[j]=' ';
                }
            }
        }
        sum=word.length()-sum;
        if(sum%2==0){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");
        }
    }
    
}
