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
public class NightattheMuseum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int current=0;
        int target=0;
        int result=0;
        int walk=0;
        String word;
        word=in.next();
        for(int i=0;i<word.length();i++){
            target=word.charAt(i)-97;
            walk=Math.abs(target-current);
            if(walk<=13){
                result+=walk;
            }else{
                result+=26-walk;
            }
            current=target;
        }
        System.out.println(result);
    }
    
}
