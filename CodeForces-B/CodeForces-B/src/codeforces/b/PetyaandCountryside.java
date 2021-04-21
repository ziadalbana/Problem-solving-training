
package codeforces.b;

import java.util.Scanner;


public class PetyaandCountryside {

    
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int sizeIn=in.nextInt();
    int[] arr=new int[sizeIn];
    for(int i=0;i<sizeIn;i++){
        arr[i]=in.nextInt();
    }
    int max=0;
    for(int i=0;i<sizeIn;i++){
       int temp= searchleft(arr,sizeIn,i);
       temp+=searchRight(arr,sizeIn,i);
       if(max<temp){
           max=temp;
       }
    }
    System.out.println(max);
    }
    public static int searchleft(int arr[],int sizeIn,int postion){
        int max=1;
        if(postion<0||postion>sizeIn) return 0;
        if(postion!=0&&arr[postion]>=arr[postion-1])
        {
            max=1+searchleft(arr,sizeIn,postion-1);
        }
        return max;
    }
    public static int searchRight(int arr[],int sizeIn,int postion){
        int max=0;
        if(postion<0||postion>sizeIn) return 0;
        if(postion!=sizeIn-1&&arr[postion]>=arr[postion+1])
        {
            max=1+searchRight(arr,sizeIn,postion+1);
        }
        return max;
    }
    
}
