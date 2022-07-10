class Solution {
      public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<graph[0].length;i++){
            int finalI = graph[0][i];
            traverse(graph,res,new ArrayList(){{add(0);add(finalI);}},graph[graph[0][i]]);
        }
        return res;
    }
    private void traverse(int[][] graph,List<List<Integer>>  res,ArrayList<Integer> temp,int[] to){
        if(temp.get(temp.size()-1)==graph.length-1){
             res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<to.length;i++){
            temp.add(to[i]);
            traverse(graph,res,temp,graph[to[i]]);
            temp.remove(temp.size()-1);
        }
    }
}