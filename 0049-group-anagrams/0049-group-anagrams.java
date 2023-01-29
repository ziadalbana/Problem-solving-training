class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        List<List<String>> res=new ArrayList<>();
        for(String str:strs){
            char[] temp=new char[26];
            for(char c:str.toCharArray()) temp[c-'a']++;
            String word=new String(temp);
            if(!map.containsKey(word)) map.put(word,new ArrayList<>()); 
            map.get(word).add(str);
        }
        res.addAll(map.values());
        return res;
    }
}