class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> holder=new ArrayList<>();
        int i=0;
        while(i<intervals.length&&intervals[i][1]<newInterval[0]) holder.add(intervals[i++]);
        int start=newInterval[0];
        int end=newInterval[1];
        while(i<intervals.length){
            if(end>=intervals[i][0]){
                start=Integer.min(start,intervals[i][0]);
                end=Integer.max(end,intervals[i][1]);
            }else{
                holder.add(new int[]{start,end});
                start=intervals[i][0];
                end=intervals[i][1];
            }
            i++;
        }
        holder.add(new int[]{start,end});
        return holder.toArray(new int[holder.size()][]);

    }
}