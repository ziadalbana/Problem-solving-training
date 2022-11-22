class Solution {
    public int[] productExceptSelf(int[] nums) {
        int p=1;
        int zeroFlag=0;
        for(int i=0;i<nums.length;i++){
           if(nums[i]==0) zeroFlag++;
           else p*=nums[i];
        }
        if(zeroFlag>1) return new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) nums[i]=p;
            else if(zeroFlag==1) nums[i]=0;
            else nums[i]=p/nums[i];
        }
        return nums;
    }
}