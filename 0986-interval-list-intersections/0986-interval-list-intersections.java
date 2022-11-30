class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int n1=firstList.length,n2=secondList.length;
        if(n1==0||n2==0) return new int[0][];
        Arrays.sort(firstList,(a1,a2)->a1[0]-a2[0]);
        Arrays.sort(secondList,(a1,a2)->a1[0]-a2[0]);
        ArrayList<int[]> res=new ArrayList<>();
        int l1=0,l2=0;
        while(l1<n1&&l2<n2){
            if((firstList[l1][1]>=secondList[l2][0]&&firstList[l1][0]<=secondList[l2][0])||
                (secondList[l2][1]>=firstList[l1][0]&&secondList[l2][0]<=firstList[l1][0])){
                int start=Integer.max(firstList[l1][0],secondList[l2][0]);
                int end=Integer.min(firstList[l1][1],secondList[l2][1]);
                res.add(new int[]{start,end});
            }
            if(firstList[l1][1]<secondList[l2][1]) l1++;
            else l2++;
        }
        return res.toArray(new int[res.size()][2]);
    }
}