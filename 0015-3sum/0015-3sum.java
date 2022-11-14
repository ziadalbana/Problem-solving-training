class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            if(i>0&&nums[i-1]==nums[i]) continue;
            findPair(res,nums,-nums[i],i+1);
        }
        return res;
    }
    private void findPair(List<List<Integer>> res,int[] nums,int target,int start ){
        int left=start,right=nums.length-1;
        while(left<right){
            int sum=nums[left]+nums[right];
            if(target==sum) {
                res.add(Arrays.asList(-target,nums[left++],nums[right--]));
                while(left<right&&nums[left]==nums[left-1]) left++;
                while(left<right&&nums[right]==nums[right+1]) right--;          
            }
            else if(sum>target) right--;
            else left++;
        }
    }
}