class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
         List<List<Integer>> res=new ArrayList<>();
         Arrays.sort(candidates);
        traverse(candidates,res,new ArrayList<>(),0,target);
        return res;
    }
    private void traverse(int[] nums, List<List<Integer>> res,List<Integer> temp,int pos,int remain){
        if(remain==0) {
            res.add(new ArrayList<>(temp));
            return;
        }
        else if(remain<0) return;
        for (int i = pos; i <nums.length ; i++) {
            if (i>pos && nums[i]==nums[i-1]) continue; 
            temp.add(nums[i]);
            traverse(nums,res,temp,i+1,remain-nums[i]);
            temp.remove(temp.size()-1);
        }
    }
}