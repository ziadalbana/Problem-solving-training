class Solution {
    public void sortColors(int[] nums) {
        int low=0,high=nums.length-1;
        int i=0;
        while(i<=high){
            if(nums[i]==1) i++;
            else if(nums[i]==0){
                swap(i++,low++,nums);
            }
            else{
                swap(i,high--,nums);
            }
        }
    }
    private void swap(int x,int y,int[] nums){
        int temp=nums[x];
        nums[x]=nums[y];
        nums[y]=temp;
    }
}