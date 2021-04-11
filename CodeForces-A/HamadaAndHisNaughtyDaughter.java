
package acm.traing;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;


public class HamadaAndHisNaughtyDaughter {

    
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      TreeMap<String, Integer> map = new TreeMap<String, Integer>();
      int t=in.nextInt();
      int i=0;
      int n=in.nextInt();
      String c;
      int count=0;
      while(count<t){
          in.next();
          c=in.next();
          if (map.containsKey(c)) {
             int cnt = map.get(c);
             map.put(c, ++cnt);
          } else {
                map.put(c, 1);
            }
          i++;
          if(i==n){
              count++;
              if(count<t){
              n=in.nextInt();
              }
              int max = map.values().stream().max(Integer::compare).get();
              Object[] n1= map.keySet().toArray();
              Object[] n2= map.values().toArray();
              map.clear();
              for(i=0;i<n2.length;i++){
                  if((int)n2[i]==max){
                      System.out.println(n1[i]);
                      break;
                  }
              }
              i=0;
          }
        
      }
    }
    
}
