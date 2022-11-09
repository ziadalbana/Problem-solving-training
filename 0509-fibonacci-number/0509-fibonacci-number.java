class Solution {
    public int fib(int n) {
        int n1=0,n2=1;
        if(n==0) return 0;
        if(n==1) return 1;
        for(int i=2;i<=n;i++){
            int temp=n2;
            n2+=n1;
            n1=temp;
        }
        return n2;
    }
}