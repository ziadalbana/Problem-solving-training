class Solution {
    public int pivotIndex(int[] nums) {
        int[] prefix=new int[nums.length];
        prefix[0]=nums[0];
        int n=nums.length-1;
        for(int i=1;i<=n;i++) prefix[i]=prefix[i-1]+nums[i];
        for(int i=0;i<=n;i++){
            int left= prefix[i]-nums[i];
            int right= prefix[n]-prefix[i];
            if(left==right) return i;
        }
        return -1;
    }
}