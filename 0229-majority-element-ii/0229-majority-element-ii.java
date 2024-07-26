class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums) map.put(n,map.getOrDefault(n,0)+1);
        double times=nums.length/3.0;
        ArrayList<Integer> list=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>times) list.add(entry.getKey()); 
        }
        return list;
    }
}