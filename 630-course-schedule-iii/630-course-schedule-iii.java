class Solution {
    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses,(o1, o2)->o1[1]==o2[1]? o1[0]-o2[0]:o1[1]-o2[1]);
        int nextAvailable=0;
        PriorityQueue<int[]> maxHeap=new PriorityQueue<>((a1,a2)->a2[0]-a1[0]);
        for(int[] course:courses){
            if(course[0]>course[1]) continue;
            if(course[0]+nextAvailable<=course[1]){
                maxHeap.add(course);
                nextAvailable+=course[0];
            }else {
                int[] max=maxHeap.peek();
                if(max[0]>course[0]){
                    nextAvailable+=(-maxHeap.poll()[0]+course[0]);
                    maxHeap.add(course);
                }
            }
        }
        return maxHeap.size();
    }
}