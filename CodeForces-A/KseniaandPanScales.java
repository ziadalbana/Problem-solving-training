
package javaapplication22;

import java.util.Scanner;


public class KseniaandPanScales {

    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        StringBuilder scale=new StringBuilder();
        scale.append(in.next());
        String add=in.next();
        int scaleSize=scale.length();
        int right=0,left=0;
        boolean check=false;
        int Balancedleft = -1,Balancedright = 0;
        int i,y=add.length();
        for( i=0;i<scaleSize;i++){
            if(scale.charAt(i)!='|'&&!check){
                left++;
            }else if(scale.charAt(i)=='|'){
                check=true;
            }else{
                right++;
            }
        }
        int postionleft,postionright;
            for(i=0;i<=add.length();i++){
            if(Balancedleft!=Balancedright){
            Balancedleft = left+y;
            Balancedright = right+i;
            y--;
            }else{
             break;
            } 
            }
            i--;
            y++;
            postionleft=left;
            postionright=Balancedleft+right+1;
            
        if(Balancedleft==Balancedright){
           if(y>0){
            scale.insert(postionleft,add.substring(0, y));
           }
           if(y<add.length()){
               scale.insert(postionright,add.substring(y));
           }
            System.out.println(scale);
        }else{
            System.out.println("Impossible");
        }
    }
    
    
}
