class Solution {
    public int maxSubArray(int[] nums) {
        int maxSub=nums[0];
        int lastMax=maxSub;
        for(int i=1;i<nums.length;i++){
            maxSub=Integer.max(nums[i],nums[i]+maxSub);
            lastMax=Integer.max(maxSub,lastMax);
        }
        return lastMax;
    }
}