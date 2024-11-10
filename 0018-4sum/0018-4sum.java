class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i>0&&nums[i]==nums[i-1]) continue;
            sum3(nums,target,res,i);
        } 
        return res;
    }
    private void  sum3(int[] nums,int target,List<List<Integer>> res,int first){
        for(int i=first+1;i<nums.length;i++){
            if((i>first+1)&&nums[i]==nums[i-1]) continue;
            sum2(nums,target,res,first,i);
        }
    }
    private void sum2(int[] nums,int target,List<List<Integer>> res,int first,int sec){
        int l=sec+1,r=nums.length-1;
        while(l<r){
            long sum=(long)nums[l]+(long)nums[r]+(long)nums[first]+(long)nums[sec];
            if(sum==target){
                res.add(Arrays.asList(nums[first],nums[sec],nums[l++],nums[r--]));
                while(l<r&&nums[l-1]==nums[l]) l++;
                while(l<r&&nums[r+1]==nums[r]) r--;
            }
            else if(sum>target) r--;
            else l++;
        }
    } 
}