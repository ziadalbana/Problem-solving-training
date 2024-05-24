class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res=new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();
        for(String s:strs){
            char[] temp=new char[26];
            for(char c:s.toCharArray()) temp[c-'a']++;
            String word=new String(temp);
            if(!map.containsKey(word))  map.put(word,new ArrayList<>());
            map.get(word).add(s);
        }
        res.addAll(map.values());
        return res;
    }
}