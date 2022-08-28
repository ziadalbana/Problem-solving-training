class Solution {
    public int findDuplicate(int[] nums) {
         int i=0;
    while(i<nums.length){
      int j=nums[i]-1;
      if(nums[i]!=nums[j]) swap(nums,i,j);
      else i++;
    }
    for(i=0;i<nums.length;i++){
      if(nums[i]-1!=i) return nums[i];
    }
    return -1;
  }
  private static void swap(int[] nums,int x,int y){
    int temp=nums[x];
    nums[x]=nums[y];
    nums[y]=temp;
  }
}