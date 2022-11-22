class Solution {
   public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(o->o[1]));
        int[] start=intervals[0];
        int count=0;
        for(int i=1;i<intervals.length;i++){
            if(start[1]>intervals[i][0]){
                count++;
                start[1]=Integer.min(start[1],intervals[i][1]);
            }else{
                start=intervals[i];
            }
        }
        return count;
    }
}