class Solution {
   public List<List<Integer>> subsets(int[] nums) {
        // List<List<Integer>> res=new ArrayList<>();
        // traverse(nums,res,new ArrayList<>(),0);
        // return res;
      List<List<Integer>> subsets = new ArrayList<>();
    // start by adding the empty subset
    subsets.add(new ArrayList<>());
    for (int currentNumber : nums) {
      // we will take all existing subsets and insert the current number in them to create new subsets
      int n = subsets.size();
      for (int i = 0; i < n; i++) {
        // create a new subset from the existing subset and insert the current element to it
        List<Integer> set = new ArrayList<>(subsets.get(i));
        set.add(currentNumber);
        subsets.add(set);
      }
    }
    return subsets;
    }
    private void traverse(int[] graph,List<List<Integer>>  res,ArrayList<Integer> temp,int to){
        res.add(new ArrayList<>(temp));
        for (int i = to; i <graph.length ; i++) {
            temp.add(graph[i]);
            traverse(graph, res, temp, i+1);
            temp.remove(temp.size() - 1);
        }
    }
}