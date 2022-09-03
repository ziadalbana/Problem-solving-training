class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int n=intervals.length;
        int[] result=new int[n];
        PriorityQueue<Integer> maxStartHeap =new  PriorityQueue<>(n,(i1,i2)->intervals[i2][0]-intervals[i1][0]);
        PriorityQueue<Integer> maxEndtHeap =new PriorityQueue<>(n,(i1,i2)->intervals[i2][1]-intervals[i1][1]);
        for(int i=0;i<n;i++){
            maxStartHeap.add(i);
            maxEndtHeap.add(i);
        }
        for(int i=0;i<n;i++){
            int topEnd=maxEndtHeap.poll();
            result[topEnd]=-1;
            if(intervals[maxStartHeap.peek()][0]>=intervals[topEnd][1]){
                int topStart=maxStartHeap.poll();
                while(!maxStartHeap.isEmpty()&&intervals[maxStartHeap.peek()][0]>=intervals[topEnd][1])
                      topStart=maxStartHeap.poll();
                result[topEnd]=topStart;
                maxStartHeap.add(topStart);
            }
        }
        return result;
        
    }
}