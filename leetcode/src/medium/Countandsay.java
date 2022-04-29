package medium;

public class Countandsay {
    public static void main(String[] args) {
        Countandsay n=new Countandsay();
       System.out.println( n.countAndSay(10));
    }
    public String countAndSay(int n) {
        String temp="1";
        String finalResult="";
        while (--n>0){
            int i=0;
            int count=1;
            for (int j = 1; j < temp.length(); j++) {
             if (temp.charAt(i)==temp.charAt(j)) {
                count++;
             }else{
                 finalResult+=count+""+temp.charAt(i);
                 count=1;
                 i=j;
             }
            }
            finalResult+=count+""+temp.charAt(i);
            temp=finalResult;
            finalResult="";
        }
        return temp;
    }
}
