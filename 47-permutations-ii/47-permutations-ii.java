class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        boolean[] used =new boolean[nums.length];
        traverse(nums,res,new ArrayList<>(),used);
        return res;
    }
    private void traverse(int[] nums, List<List<Integer>> res,List<Integer> temp,boolean[] used){
        if(temp.size()==nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]||(i>0&&nums[i]==nums[i-1]&&!used[i-1])) continue;
            temp.add(nums[i]);
            used[i]=true;
            traverse(nums,res,temp,used);
            used[i]=false;
            temp.remove(temp.size()-1);
        }
    }
}