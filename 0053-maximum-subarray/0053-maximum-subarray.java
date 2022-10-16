class Solution {
    public int maxSubArray(int[] nums) {
        int maxEnding=0;
        int maxSoFar=Integer.MIN_VALUE;
        for(int n:nums){
            maxEnding+=n;
            maxSoFar=Integer.max(maxSoFar,maxEnding);
            if(maxEnding<0) maxEnding=0;
        }
        return maxSoFar;
        // int sum=0,max=Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     sum+=nums[i];
        //     max=Integer.max(max,sum);
        //     if(sum<0) sum=0;
        // }
        // return max;
    }
}