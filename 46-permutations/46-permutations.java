class Solution {
    public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    Queue<List<Integer>> queue=new LinkedList<>();
    queue.add(new ArrayList<>());
    for(int num:nums){
       int n=queue.size();
       for(int i=0;i<n;i++){
        List<Integer> oldPermutions=queue.poll();
        for(int j=0;j<=oldPermutions.size();j++){
           List<Integer> newPermutions=new ArrayList<>(oldPermutions);
           newPermutions.add(j,num);
           if(newPermutions.size()==nums.length){
             result.add(newPermutions);
           }else {
             queue.add(newPermutions);
           }
        }
       }
    }
    return result;
}
    // private void perm(int[] nums, List<List<Integer>> result,List<Integer> temp){
    //     if(temp.size()==nums.length)  result.add(new ArrayList<>(temp));
    //     else{
    //         for(int i=0;i<nums.length;i++){
    //             if(temp.contains(nums[i])) continue;
    //             temp.add(nums[i]);
    //             perm(nums,result,temp);
    //             temp.remove(temp.size()-1);
    //         }
    //     }
    // }
}