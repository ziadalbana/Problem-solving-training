class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<List<Integer>> maxHeap=new PriorityQueue<>((p1,p2)->(p2.get(0)+p2.get(1))-       (p1.get(0)+p1.get(1)));
        for(int i=0;i<nums1.length&&i<k;i++){
            for(int j=0;j<nums2.length&&j<k;j++){
                if(maxHeap.size()<k) maxHeap.add(new ArrayList<>(Arrays.asList(nums1[i],nums2[j])));
                else {
                    if(nums1[i]+nums2[j]>maxHeap.peek().get(0)+maxHeap.peek().get(1)) break;
                    else{
                        maxHeap.poll();
                        maxHeap.add(new ArrayList<>(Arrays.asList(nums1[i],nums2[j])));
                    }
                }
            }
        }
        return new ArrayList<>(maxHeap);
    }
}