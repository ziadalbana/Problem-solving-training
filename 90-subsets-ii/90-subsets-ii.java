class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        traverse(nums,res,new ArrayList<>(),0);
        return res;
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