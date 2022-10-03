class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> MHT=new ArrayList<>();
        if(n==1){
            MHT.add(0);
            return MHT;
        }
        //1.intialize graph
        HashMap<Integer,Integer> inDegree=new HashMap<>();
        HashMap<Integer,List<Integer>> graph=new HashMap<>();
        for(int i=0;i<n;i++){
            inDegree.put(i,0);
            graph.put(i,new ArrayList<>());
        }
        //2.built graph
        for(int[] edge:edges){
            inDegree.put(edge[0],inDegree.get(edge[0])+1);
            inDegree.put(edge[1],inDegree.get(edge[1])+1);
            graph.get(edge[1]).add(edge[0]);
            graph.get(edge[0]).add(edge[1]);
        }
        //3.choose leaves
        Queue<Integer> leaves=new LinkedList<>();
        for(Map.Entry<Integer,Integer> entry:inDegree.entrySet()){
            if(entry.getValue()==1) leaves.add(entry.getKey());
        }
        //4.get MHT
        int totalNodes=n;
        while(totalNodes>2){
            int leavesSize=leaves.size();
            totalNodes-=leavesSize;
            for(int i=0;i<leavesSize;i++){
                int node=leaves.poll();
                List<Integer> children=graph.get(node);
                for(int child:children){
                    inDegree.put(child,inDegree.get(child)-1);
                    if(inDegree.get(child)==1) leaves.add(child);
                }
            }
        }
        MHT.addAll(leaves);
        return MHT;
    }
}