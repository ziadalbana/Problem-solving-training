class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int pointer1=0;
        int pointer2=0;
        List<int[]> intervals = new ArrayList<>();
        while(pointer1<firstList.length&&pointer2<secondList.length){
            if((firstList[pointer1][1]>=secondList[pointer2][0]&&firstList[pointer1][0]<=secondList[pointer2][0])
              ||(secondList[pointer2][1]>=firstList[pointer1][0]&&secondList[pointer2][0]<=firstList[pointer1][0]))             {
             int start=Integer.max(firstList[pointer1][0],secondList[pointer2][0]);
             int end=Integer.min(firstList[pointer1][1],secondList[pointer2][1]);
             intervals.add(new int[]{start,end});
            }
            if(firstList[pointer1][1]<secondList[pointer2][1]) pointer1++;
            else pointer2++;
        }
         return intervals.toArray(new int[intervals.size()][2]);
        
        
        
        
        
        
        
        
        
        
        
        
        
        // int i=0,j=0;
        // ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        // while(i<firstList.length&&j<secondList.length){
        //     if(firstList[i][0]>=secondList[j][0]&&firstList[i][0]<=secondList[j][1]) {
        //         res.add(new ArrayList());
        //         res.get(res.size()-1).add(firstList[i][0]);
        //         if(firstList[i][1]<=secondList[j][1]) {
        //             res.get(res.size()-1).add(firstList[i][1]);
        //             i++;
        //         }else{
        //             res.get(res.size()-1).add(secondList[j][1]);
        //             j++;
        //         }
        //     }else if(firstList[i][0]<=secondList[j][0]&&secondList[j][0]<=firstList[i][1]){
        //         res.add(new ArrayList());
        //         res.get(res.size()-1).add(secondList[j][0]);
        //         if(firstList[i][1]<=secondList[j][1]) {
        //             res.get(res.size()-1).add(firstList[i][1]);
        //             i++;
        //         }else {
        //             res.get(res.size()-1).add(secondList[j][1]);
        //             j++;
        //         }
        //     }
        //     else {
        //         if(firstList[i][1]<secondList[j][0]) i++;
        //         else j++;
        //     }
        // }
        // int[][] temp=new int[res.size()][2];
        // for (int k = 0; k < res.size(); k++) {
        //     temp[k][0]=res.get(k).get(0);
        //     temp[k][1]=res.get(k).get(1);
        // }
        // return temp;
    }
}