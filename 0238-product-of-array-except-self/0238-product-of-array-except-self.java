class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeroCount=0;
        int zeroIndex=0;
        int prod=1;
        int s=nums.length;
        for(int i=0;i<s;i++){
            if(nums[i]==0){
               zeroCount++;
                zeroIndex=i;
               continue;
            }
            prod*=nums[i];
        }
        int[] res=new int[s];
        if(zeroCount==1){
            res[zeroIndex]=prod;
            return res;
        }
        else if(zeroCount>1) return res;
        for(int i=0;i<s;i++){
            res[i]=prod/nums[i];
        }
        return res;
    }
}