/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acm.traing;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;

public class HamadaAndTheLittleGirl {

    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String name=in.next();    
        int i;
        TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();
        for (i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (map.containsKey(c)) {
                int cnt = map.get(c);
                map.put(c, ++cnt);
            } else {
                map.put(c, 1);
            }
        }
        int size=map.size();
        Object[] n1 =map.keySet().toArray();
        Object[] n2=map.values().toArray();
        for(i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if((int)n2[i]>(int)n2[j]){
                    int tempnum=(int) n2[j];
                    n2[j]=n2[i];
                    n2[i]=tempnum;
                    char tempc=(char) n1[j];
                    n1[j]=n1[i];
                    n1[i]=tempc;
                }else if((int)n2[i]==(int)n2[j]&&(char)n1[i]>(char)n1[j]){
                    char tempc=(char) n1[j];
                    n1[j]=n1[i];
                    n1[i]=tempc;
                }
                    
                }
            }
        
        
        int count=0;
        int mid=map.size()/2;
        
        if(map.size()%2==0){
            System.out.print(n1[mid-1]+""+n1[mid]);
        }else{
             System.out.print(n1[mid]);
        }
        
    }


   
}
