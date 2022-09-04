class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        // Arrays.sort(nums);
        // List<List<Integer>> res=new ArrayList<>();
        // traverse(nums,res,new ArrayList<>(),0);
        // return res;
    List<List<Integer>> subsets = new ArrayList<>();
    Arrays.sort(nums);
    subsets.add(new ArrayList<>());
    int end=0;
    for(int i=0;i<nums.length;i++){
      int start=0;
      if(i>0&&nums[i]==nums[i-1]) start=end;
      end =subsets.size();
      for(int j=start;j<end;j++){
        List<Integer> subset = new ArrayList<>(subsets.get(j));
        subset.add(nums[i]);
        subsets.add(subset);
      }
    }   
    return subsets;
    }
    private void traverse(int[] graph,List<List<Integer>>  res,ArrayList<Integer> temp,int to){
        res.add(new ArrayList<>(temp));
        for (int i = to; i <graph.length ; i++) {
            if(i>to&&graph[i]==graph[i-1]) continue;
            temp.add(graph[i]);
            traverse(graph, res, temp, i+1);
            temp.remove(temp.size() - 1);
        }
    }
}