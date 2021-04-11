
package javaapplication22;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Dubstep {

    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       String word=in.next();
       
       int i=0;
         word=word.replaceAll("WUB"," ");
        System.out.println(word);
    }
    
}
