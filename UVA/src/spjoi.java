import java.util.Scanner;


 class spjoi {
     static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int cases=in.nextInt();
        int[] forbiden=new int[5];
        int i;
        for(i=0;i<cases;i++){
            int count=0;
            int n=in.nextInt();
            int m=in.nextInt();
            int a=in.nextInt();
            int b=in.nextInt();
            forbiden[0]=a;
            forbiden[1]=a+b;
            forbiden[2]=a+2*b;
            forbiden[3]=a+3*b;
            forbiden[4]=a+4*b;
            for(int j=n;j<=m;j++){
                count++;
                for(int y=0;y<5;y++){
                    if(j%forbiden[y]==0){
                        count--;
                        break;
                    }
                }
            }
            System.out.println(count);

        }
    }

}
