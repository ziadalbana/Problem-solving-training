class Solution {
    public double myPow(double x, int n) {
        long nn=n;
        if(n<0) nn=-1*(long)n;
        double ans=1;
        while(nn>0){
            if(nn%2==1){
                ans*=x;
                nn--;
            }else {
                x=x*x;
                nn/=2;
            }
        }
        if(n<0) ans=(double)1/(double)ans;
        return ans;
    }
}