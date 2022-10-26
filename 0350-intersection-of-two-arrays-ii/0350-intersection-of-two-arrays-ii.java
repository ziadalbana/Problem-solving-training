class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int p1=0,p2=0;
        int n1=nums1.length,n2=nums2.length;
        ArrayList<Integer> res=new ArrayList<>();
        while(p1<n1&&p2<n2){
           if(nums1[p1]>nums2[p2]) p2++;
           else if(nums1[p1]<nums2[p2]) p1++;
           else {
               res.add(nums1[p1]);
               p1++;
               p2++;
           }
        }
        return res.stream().mapToInt(i -> i).toArray();
    }
}