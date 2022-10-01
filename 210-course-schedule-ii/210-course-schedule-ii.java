class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
    HashMap<Integer,Integer> inDegree=new HashMap<>();
    HashMap<Integer,List<Integer>> graph=new HashMap<>();
    for(int i=0;i<numCourses;i++){
      inDegree.put(i,0);
      graph.put(i,new ArrayList<>());
    } 
    //2.build Graph
    for(int i=0;i<prerequisites.length;i++){
      int parent=prerequisites[i][1],child=prerequisites[i][0];
      inDegree.put(child,inDegree.get(child)+1);
      graph.get(parent).add(child);
    }
    //3 .get source
    Queue<Integer> source=new LinkedList<>();
    for(Map.Entry<Integer,Integer> entry:inDegree.entrySet()){
      if(entry.getValue()==0) source.add(entry.getKey());
    }
    // 4 .get sortedArray
    List<Integer> list=new ArrayList<>();
    while(!source.isEmpty()){
      int vertx=source.poll();
      list.add(vertx);
      List<Integer> children=graph.get(vertx);
      for(int child:children){
        inDegree.put(child,inDegree.get(child)-1);
        if(inDegree.get(child)==0) source.add(child);
      }
    }
        int[] res=new int[numCourses];
        if(list.size()==numCourses){
            for (int i = 0; i < list.size(); i++) {
                res[i]=list.get(i);
            }
            return res;
        }
        else return new int[0];
    }
}