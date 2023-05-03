class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        List<List<Integer>> res=new ArrayList<>();
        for(int n:nums1) set1.add(n);
        for(int n:nums2) set2.add(n);
        HashSet<Integer> onlyInSet1=new HashSet<>();
        HashSet<Integer> onlyInSet2=new HashSet<>();
        
        for(int n:nums1){
            if(!set2.contains(n)) onlyInSet1.add(n);
        }
         res.add(new ArrayList<>());
        for(int n:nums2){
            if(!set1.contains(n)) onlyInSet2.add(n);
        }
        return Arrays.asList(new ArrayList<>(onlyInSet1),new ArrayList<>(onlyInSet2));
    }
}