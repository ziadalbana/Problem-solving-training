class Solution {
 public boolean canFinish(int numCourses, int[][] prerequisites) {
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
    return list.size()==numCourses ? true:false;
}
//         ArrayList<ArrayList<Integer>> adjlist=new ArrayList<>();
//         for(int i=0;i<numCourses;i++){
//             adjlist.add(new ArrayList<>());
//         }
//         for(int i=0;i<prerequisites.length;i++){
//             adjlist.get(prerequisites[i][0]).add(prerequisites[i][1]);
//         }
//         int [] status=new int[numCourses];
//         for (int x:status) {
//             x=0;
//         }
//         for (int i = 0; i <numCourses ; i++) {
//           if(status[i]==0){
//               if(isCycl(adjlist,status,i)) return false;
//           }
//         }
//         return true;
//     }
//     private static   boolean isCycl(ArrayList<ArrayList<Integer>> adjlist,int[] status,int curr){
//         if(status[curr]==1) return true;
//         status[curr]=1;
//         for (int i = 0; i < adjlist.get(curr).size(); i++) {
//             if(status[adjlist.get(curr).get(i)]!=2)
//             if(isCycl(adjlist,status,adjlist.get(curr).get(i)))
//                 return true;
//         }
//         status[curr]=2;
//         return false;
//     }
}