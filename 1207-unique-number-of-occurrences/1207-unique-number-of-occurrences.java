class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        HashSet<Integer> set=new HashSet<>();
        for(int n:arr) map.put(n,map.getOrDefault(n,0)+1);
        for(int n:map.values()){
            if(!set.add(n)) return false; 
        }
        return true;
    }
}