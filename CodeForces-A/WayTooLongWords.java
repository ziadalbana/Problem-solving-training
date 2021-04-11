/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traing;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class WayTooLongWords {
    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int cases=in.nextInt();
        char begin;
        char end;
        String[] words=new String[cases];
        for(int i=0;i<cases;i++){
            words[i]=in.next();
            if(words[i].length()>10){
            begin=words[i].charAt(0);
            end=words[i].charAt(words[i].length()-1);
            String s = new StringBuilder().append(begin).append(words[i].length()-2).append(end).toString();
            System.out.println(s);
        }else{
            System.out.println(words[i]);
        }
        
    }
    
}
}
