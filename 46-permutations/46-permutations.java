class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList();
        perm(nums,result,new ArrayList());
        return result;
    }
    private void perm(int[] nums, List<List<Integer>> result,List<Integer> temp){
        if(temp.size()==nums.length)  result.add(new ArrayList<>(temp));
        else{
            for(int i=0;i<nums.length;i++){
                if(temp.contains(nums[i])) continue;
                temp.add(nums[i]);
                perm(nums,result,temp);
                 temp.remove(temp.size()-1);
            }
        }
    }
}