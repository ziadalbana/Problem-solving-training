class Solution {
    public int[] singleNumber(int[] nums) {
      int xy=0;
        int num1=0,num2=0;
      for(int n:nums) xy^=n;
      int rightMostSetBit=xy&-xy;
      for(int n:nums){
          if((rightMostSetBit&n)==0) num1^=n;
          else num2^=n;
      }
    return new int[]{num1,num2};
    }
}