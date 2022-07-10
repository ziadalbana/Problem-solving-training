class Solution {
   public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        traverse(nums,res,new ArrayList<>(),0);
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