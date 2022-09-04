class Solution {
    public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    perm(nums,result,new ArrayList<>(),0);    
    return result;
}
    private void perm(int[] nums, List<List<Integer>> result,List<Integer> temp,int index){
        if(temp.size()==nums.length)  result.add(new ArrayList<>(temp));
        else{
            for(int i=0;i<=temp.size();i++){
                List<Integer> currTemp = new ArrayList<>(temp);
                currTemp.add(i,nums[index]);
                perm(nums,result,currTemp,index+1);
            }
        }
    }
}