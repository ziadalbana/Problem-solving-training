class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i>0&&nums[i-1]==nums[i]) continue;
            findPair(nums,res,nums[i],i+1);
        }
        return res;
    }
    private void findPair(int[] nums,List<List<Integer>> res,int target,int start){
        int l=start,r=nums.length-1;
        while(l<r){
            int sum=nums[l]+nums[r]+target;
            if(sum==0){
                res.add(Arrays.asList(nums[l++],nums[r--],target));
                while(l<r&&nums[l]==nums[l-1]) l++;
                while(l<r&&nums[r]==nums[r+1]) r--;
            }
            else if(sum>0) r--;
            else l++;
        }
    }
}