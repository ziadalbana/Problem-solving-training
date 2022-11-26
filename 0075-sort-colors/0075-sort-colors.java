class Solution {
    public void sortColors(int[] nums) {
        int l=0,r=nums.length-1;
        int i=0;
        while(i<=r){
            if(nums[i]==0) swap(nums,l++,i++);
            else if(nums[i]==1) i++;
            else swap(nums,i,r--);
        }
    }
    private void swap(int[] nums,int l,int r){
        int temp=nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
    }
}