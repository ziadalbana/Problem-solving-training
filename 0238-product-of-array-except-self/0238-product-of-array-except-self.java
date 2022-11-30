class Solution {
    public int[] productExceptSelf(int[] nums) {
        int p=1;
        int zeroFlag=0;
        int zeroIndex=0;
        for(int i=0;i<nums.length;i++){
           if(nums[i]==0){
               zeroFlag++;
               zeroIndex=i; 
          }
           else p*=nums[i];
        }
        if(zeroFlag>1) return new int[nums.length];
        if(zeroFlag==1){
          int[] res=new int[nums.length];
            res[zeroIndex]=p;
            return res;
        }
        for(int i=0;i<nums.length;i++) nums[i]=p/nums[i];
    
        return nums;
    }
}