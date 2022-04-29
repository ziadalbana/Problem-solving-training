package medium;

public class Pow50 {
    public double myPow(double x, int n) {
        if (n>0){
        String binary=Integer.toBinaryString(n);
        double result=1;
        for (int i = binary.length(); i >=0; i--) {
            if (binary.charAt(i)=='1') result*=x;
            x*=x;
        }
        return result;
        }else {
            n*=-1;
            String binary=Integer.toBinaryString(n);
            double result=1;
            for (int i = binary.length(); i >=0; i--) {
                if (binary.charAt(i)=='1') result/=x;
                x*=x;
            }
            return result;
        }
    }
}
