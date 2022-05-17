class Solution {
    public int rob(int[] nums) {
       int size=nums.length;
       if(size==1) return nums[0];
       int[] mem=new int[size+1];
        mem[0]=0;
        mem[1]=nums[0];
        for(int i=1;i<size;i++){
            mem[i+1]=Integer.max(mem[i],mem[i-1]+nums[i]);
        }
        return mem[size];
    }
        
}