import java.util.ArrayList;

class Solution1 {
    public static void main(String[] args) {
        int numCourses = 2; int[][] prerequisites =new int[][] {{1,0},{0,1}};
        System.out.println(canFinish(numCourses,prerequisites));
    }
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adjlist=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adjlist.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++){
            adjlist.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        int [] status=new int[numCourses];
        for (int x:status) {
            x=0;
        }
        for (int i = 0; i <numCourses ; i++) {
          if(status[i]==0){
              if(isCycl(adjlist,status,i)) return false;
          }
        }
        return true;
    }
    private static   boolean isCycl(ArrayList<ArrayList<Integer>> adjlist,int[] status,int curr){
        if(status[curr]==1) return true;
        status[curr]=1;
        for (int i = 0; i < adjlist.get(curr).size(); i++) {
            if(status[adjlist.get(curr).get(i)]!=2) {
                if (isCycl(adjlist, status, adjlist.get(curr).get(i)))
                    return true;
            }
        }
        status[curr]=2;
        return false;
    }


}
