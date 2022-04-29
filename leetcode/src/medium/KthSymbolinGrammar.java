package medium;

public class KthSymbolinGrammar {
    public static void main(String[] args) {
        KthSymbolinGrammar n=new KthSymbolinGrammar();
        System.out.println(n.kthGrammar(3,3));
    }
    public int kthGrammar(int n, int k) {
        /*
       0
       01
       0110
       01101001
       0110100110010110
       */
        String level="0";
        for (int i = 1; i < n; i++) {
            StringBuilder builder=new StringBuilder();

            builder.append(level);
            for (int j = 0; j < level.length(); j++) {
                if(level.charAt(j)=='0') builder.append("1");
                else builder.append("0");
            }
            level=new String(builder);
        }
        //System.out.println(level);
        return level.charAt(k-1)-'0';
    }
}
