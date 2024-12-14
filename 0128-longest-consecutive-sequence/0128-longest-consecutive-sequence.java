class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums) set.add(num);
        int max=0;
        for(int i=0;i<nums.length;i++){
            int strike=1;
            int curr=nums[i];
            if(!set.contains(curr-1)){
            while(set.contains(curr+1)){
                curr++;
                strike++;
            }
            max=Integer.max(max,strike);
           }
        }
        return max;
    }
}