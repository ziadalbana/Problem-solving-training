class Solution {
    public List<Integer> intersection(int[][] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int[] arr:nums){
            for(int num:arr) map.put(num,map.getOrDefault(num,0)+1);
        }
        int freq=nums.length;
        ArrayList<Integer> res=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==freq) res.add(entry.getKey());
        }
        res.sort((a,b)->a.compareTo(b));
        return  res;
    }
}