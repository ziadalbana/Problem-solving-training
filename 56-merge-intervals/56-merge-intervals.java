class Solution {
    public  int[][] merge(int[][] intervals) {
        List<int[]> holder=new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        int start=intervals[0][0];
        int end=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            int[] interval=intervals[i];
            if(end>=interval[0]){
                end=Integer.max(end,interval[1]);
            }else {
                holder.add(new int[]{start,end});
                start=interval[0];
                end=interval[1];
            }
        }
        holder.add(new int[]{start,end});
        int[][] res=new int[holder.size()][2];
        holder.toArray(res);
        return res;
    }
    
//   public  int[][] merge(int[][] intervals) {
//         if(intervals.length==1) return intervals;
//         ArrayList<int[]> arr=new ArrayList<>();
//         sort(intervals);
//         int[] temp=intervals[0];
//         arr.add(temp);
//         for(int i=1;i<intervals.length;i++){
//            int currentStart=intervals[i][0];
//            int currentEnd=intervals[i][1];
//           if(temp[1]>=currentStart) {
//               if (temp[1] < currentEnd) {
//                   temp[1] = currentEnd;
//               }
//           }else{
//               temp=intervals[i];
//               arr.add(temp);
//           }

//         }

//         return  convert(arr);
//     }
//     public  void sort(int[][] arr){
//         for(int i=0;i<arr.length;i++){
//             int min=arr[i][0];
//             int postiony = i;
//             for(int y=i+1;y<arr.length;y++){
//                 if(min>arr[y][0]){
//                     min=arr[y][0];
//                     postiony=y;
//                 }
//             }
//             int tempX=arr[i][0];
//             int tempY=arr[i][1];
//             arr[i][0]=arr[postiony][0];
//             arr[i][1]=arr[postiony][1];
//             arr[postiony][0]=tempX;
//             arr[postiony][1]=tempY;
//         }
//     }
//     public   int[][] convert( ArrayList<int[]> arr){
//         int [][] ans=new int[arr.size()][2];
//         for (int i = 0; i < arr.size() ; i++) {
//             ans[i][0]=arr.get(i)[0];
//             ans[i][1]=arr.get(i)[1];
//         }
//         return ans;
//     }
}