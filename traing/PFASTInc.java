/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Alex
 */
public class PFASTInc {

    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int pair=in.nextInt();
      String[] names=new String[n];
       ArrayList<String> pairnames=new ArrayList<>();
        ArrayList<String> temp=new ArrayList<>();
       ArrayList<String> result=new ArrayList<>();
       TreeMap<String, Integer> map = new TreeMap<>();
      int i;
      int cnt=0;
      for(i=0;i<n;i++){
          names[i]=in.next();
      }
      for(i=0;i<2*pair;i++){
          String c =in.next();
          pairnames.add(c);
            if (map.containsKey(c)) {
                int count = map.get(c);
                map.put(c, ++count);
            } else {
                map.put(c, 1);
            }
        
      }
      for(i=0;i<n;i++){
          if(!pairnames.contains(names[i])){
              result.add(names[i]);
              cnt++;
          }
      }
      for(i=0;i<2*pair-1;i+=2){
         if(map.get(pairnames.get(i))>map.get(pairnames.get(i+1))){ 
          if(!temp.contains(pairnames.get(i+1))&&!temp.contains(pairnames.get(i))){
          result.add(pairnames.get(i+1));
          temp.add(pairnames.get(i));
           temp.add(pairnames.get(i+1));
          cnt++;
          }
         }else if(map.get(pairnames.get(i))<=map.get(pairnames.get(i+1))){
             if(!temp.contains(pairnames.get(i+1))&&!temp.contains(pairnames.get(i))){
          result.add(pairnames.get(i));
          temp.add(pairnames.get(i+1));
            temp.add(pairnames.get(i));
          cnt++;
            }
        }
         
      }
      Collections.sort(result);
      System.out.println(cnt);
      for(i=0;i<result.size();i++){
          System.out.println(result.get(i));
      }
      
      
      
      
    }
    
}
