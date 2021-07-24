import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main1 {
    public static void main(String[] args) {
         Main1 n=new Main1();
         n.solution();
    }
    void solution(){
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            StringTokenizer s = new StringTokenizer(in.readLine());
            int testCases=Integer.parseInt(s.nextToken());
            for (int i = 0; i < testCases; i++) {
                s = new StringTokenizer(in.readLine());
                String word1= s.nextToken();
                String word2=s.nextToken();
                System.out.println(revsersed(word1,word2));
            }

        } catch (Exception e) {
            try {
                in.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }

    }
    String revsersed(String word1,String word2){
        Queue<Integer> result=new LinkedList<>();
        int i=0,j=0;
        int carry=0;
        while(i<word1.length()&&j<word2.length()){
            int temp=(word1.charAt(i)-'0')+(word2.charAt(j)-'0')+carry;
            carry=temp/10;
            temp%=10;
            result.add(temp);
            i++;
            j++;
        }
        while (i<word1.length()){
            int temp=(word1.charAt(i)-'0')+carry;
            carry=temp/10;
            temp%=10;
            result.add(temp);
            i++;
        }
        while (j<word2.length()){
            int temp=(word2.charAt(j)-'0')+carry;
            carry=temp/10;
            temp%=10;
            result.add(temp);
            j++;
        }
        if(carry!=0){
            result.add(carry);
        }
        String finalresult="";
        boolean first=false;
        while(!result.isEmpty()){
            int temp=result.poll();
            if(temp!=0||first){
                finalresult+=temp;
                first=true;
            }
        }
        i=finalresult.length()-1;
        int index=0;
        while(finalresult.charAt(i)=='0'){
            i--;
            index++;
        }
        return finalresult.substring(0,finalresult.length()-index);
    }
}
