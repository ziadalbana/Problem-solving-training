class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int i=0;
        List<int[]> newIntervals=new ArrayList<>();
        while(i<intervals.length&&intervals[i][1]<newInterval[0]) newIntervals.add(intervals[i++]);   
        while(i<intervals.length&&newInterval[1]>=intervals[i][0]){
            newInterval[0]=Integer.min(intervals[i][0], newInterval[0]);
            newInterval[1]=Integer.max(intervals[i][1], newInterval[1]);
            i++;
        }
        newIntervals.add(newInterval);
        while(i<intervals.length) newIntervals.add(intervals[i++]);
        return newIntervals.toArray(new int[newIntervals.size()][]); 
            
        }
        
        
        
        
        
        
        
        
        
                
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // List<int[]> holder=new ArrayList<>();
        // int i=0;
        // while(i<intervals.length&&intervals[i][1]<newInterval[0]) holder.add(intervals[i++]);
        // int start=newInterval[0];
        // int end=newInterval[1];
        // while(i<intervals.length&&newInterval[1]>=intervals[i][0]){
        //  newInterval[0]=Integer.min(newInterval[0],intervals[i][0]);
        //  newInterval[1]=Integer.max(newInterval[1],intervals[i][1]);
        //  i++;
        // }
        // holder.add(newInterval);
        // while(i<intervals.length) holder.add(intervals[i++]);
        // return holder.toArray(new int[holder.size()][]);

    
}