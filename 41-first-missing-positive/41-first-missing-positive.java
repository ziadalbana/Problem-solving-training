class Solution {
    public int firstMissingPositive(int[] nums) {
     int i=0;
        while(i<nums.length){
            int j=nums[i];
            if(j>0&&j<=nums.length&&nums[i]!=nums[j-1]) swap(nums,i,j-1);
            else i++;
        }
        for(i=0;i<nums.length;i++){
            if(nums[i]!=i+1) return i+1;
        }
        return nums.length +1;
    }
    private static void swap(int[] nums,int x,int y){
        int temp=nums[x];
        nums[x]=nums[y];
        nums[y]=temp;
    }
}