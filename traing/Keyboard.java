
package traing;

import java.util.Scanner;


public class Keyboard {

    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        char c=in.next().charAt(0);
        String word=in.next();
        String keyboard="qwertyuiopasdfghjkl;zxcvbnm,./";
        String result="";
        int shit;
        int i;
        int postion;
        if(c=='R'){
            shit=-1;
        }else{
            shit=1;
        }
        for(i=0;i<word.length();i++){
            postion=keyboard.indexOf(word.charAt(i))+shit;
            result+=keyboard.charAt(postion);
        }
        System.out.println(result);
    }
    
}
