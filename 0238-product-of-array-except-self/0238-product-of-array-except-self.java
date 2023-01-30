class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res=new int[nums.length];
        int zeroCount=0;
        int zeroIndex=0;
        int p=1;
        for(int i=0;i<nums.length;i++){
          if(nums[i]==0){
             zeroCount++;
             zeroIndex=i;
          }else  p*=nums[i];
        }
        if(zeroCount>1) return res;
        else if(zeroCount==1) {
            res[zeroIndex]=p;
            return res;
        }
        for(int i=0;i<nums.length;i++){
            res[i]=p/nums[i];
        }
        return res;
    }
}