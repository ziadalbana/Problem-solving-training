class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int last=nums[0];
        int maxSub=last;
        for(int i=1;i<n;i++){
            last=Integer.max(last+nums[i],nums[i]);
            maxSub=Integer.max(maxSub,last);
        }
        return maxSub;
    }
}