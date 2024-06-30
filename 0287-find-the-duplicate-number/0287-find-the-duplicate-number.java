class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        while (i<nums.length){
            if(nums[i]!=i+1 &&nums[nums[i]-1] == nums[i]) return nums[i];
            else if (nums[i]!=i+1) swap(nums,i,nums[i]-1);
            else i++;
        }
        return -1;
    }
    private void swap(int[] nums,int x,int y){
        int temp=nums[x];
        nums[x]=nums[y];
        nums[y]=temp;
    }
}