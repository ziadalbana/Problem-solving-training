
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class MountainScenery {

    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int count=0;
        int size=2*n+1;
        ArrayList<Integer> peeks=new ArrayList<>();
        int[] temp=new int[size];
        boolean[] visited=new boolean[size];
        int i;
        for(i=0;i<size;i++){
            int num=in.nextInt();
            peeks.add(num);
            temp[i]=num;
            
        }
        Arrays.sort(temp);
       i=0;
        while(count<k){
           if(peeks.get(i)==temp[size-1-count]&&!visited[i]){
               peeks.set(i,peeks.get(i)-1);
               count++;
               visited[i]=true;
           }
           i++;
           if(i==size){
               i=0;
           }
        }

        
        for(i=0;i<2*n+1;i++){
            System.out.print(peeks.get(i)+" ");
        }
    }
    
}
