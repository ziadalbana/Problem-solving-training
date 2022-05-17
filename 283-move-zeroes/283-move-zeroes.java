class Solution {
  public void moveZeroes(int[] nums) {
      if(nums.length==1) return;
      int endPointer=nums.length-1;
      int i=0;
      while (i <= endPointer){
             if (nums[i]==0){
                 shift(nums,i,endPointer);
                 endPointer--;
             }else {
                 i++;
             }
        }
    }
    private void shift(int[] nums,int i,int j){
        for (int k = i; k <j; k++) {
            nums[k]=nums[k+1];
        }
        nums[j]=0;
    }
}