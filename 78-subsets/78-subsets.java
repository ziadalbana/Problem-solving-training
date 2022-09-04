class Solution {
   public List<List<Integer>> subsets(int[] nums) {
      List<List<Integer>> res=new ArrayList<>();
      res.add(new ArrayList<>());
      for(int num:nums){
          int n=res.size();
          for(int i=0;i<n;i++){
              List<Integer> subset=new ArrayList<>(res.get(i));
              subset.add(num);
              res.add(subset);
          }
      }
      return res;
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