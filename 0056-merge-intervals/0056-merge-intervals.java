class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> list=new ArrayList<>();
        Arrays.sort(intervals,(a1,a2)->a1[0]-a2[0]);
        int[] start=intervals[0];
        for(int i=1;i<intervals.length;i++){
            if(start[1]>=intervals[i][0]){
                start[1]=Integer.max(start[1],intervals[i][1]);
            }else{
                list.add(start);
                start=intervals[i];
            }
        }
        list.add(start);
        return list.toArray(new int[list.size()][2]);
    }
}