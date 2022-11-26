class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i!=0&&nums[i-1]==nums[i]) continue;
            findPair(res,nums,i);
        }
        return res;
    }
    private void findPair(List<List<Integer>> res,int[] nums,int idx){
        int target=nums[idx];
        int left=idx+1,right=nums.length-1;
        while(left<right){
            int sum=target+nums[left]+nums[right];
            if(sum==0){
                res.add(Arrays.asList(target,nums[left++],nums[right--]));
                while(left<right&&nums[left]==nums[left-1]) left++;
                while(left<right&&nums[right]==nums[right+1]) right--;
            }
            else if(sum>0) right--;
            else left++;
        }
    }
}