class Solution {
   public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(o->o[0]));
        int end=intervals[0][1];
        int count=0;
        for(int i=1;i<intervals.length;i++){
            if(end>intervals[i][0]) {
                count++;
                end=Integer.min(end,intervals[i][1]);
            }
            else{
                end=intervals[i][1];
            }
        }
        return count;
    }
}