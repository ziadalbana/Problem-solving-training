class Solution {
    public int climbStairs(int n) {
        if(n==1) return 1;
        else if (n==2) return 2;
        int stepOne=1;
        int stepTwo=2;
        int ways=0;
        for(int i=3;i<=n;i++){
            ways=stepOne+stepTwo;
            stepOne=stepTwo;
            stepTwo=ways;
        }
        return ways;
    }
}