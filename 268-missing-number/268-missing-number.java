class Solution {
     public int missingNumber(int[] nums) {
         int x1=0,x2=nums[0];
         int n=nums.length;
         for(int i=1;i<=n;i++) x1^=i;
         for(int i=1;i<n;i++) x2^=nums[i];
         return x1^x2;
         
     }
    
  //   public int missingNumber(int[] nums) {
  //      int i=0;
  //   while(i<nums.length){
  //     int j=nums[i];
  //     if(j<nums.length&&nums[i]!=nums[j]) swap(nums,i,j);
  //     else i++;
  //   }
  //   for(i=0;i<nums.length;i++) if(nums[i]!=i) return i;
  //   return nums.length;
  // }
  // private static void swap(int[] nums,int x,int y){
  //   int temp=nums[x];
  //   nums[x]=nums[y];
  //   nums[y]=temp;
  // } 
}