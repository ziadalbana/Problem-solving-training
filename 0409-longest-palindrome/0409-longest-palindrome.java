class Solution {
     public int longestPalindrome(String s) {
        int count=0;
        int odd=0; 
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()) map.put(c,map.getOrDefault(c,0)+1);
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            if(entry.getValue()%2==0) count+=entry.getValue();
            else  {
                odd=1;
                count+=(entry.getValue()-1);
            }
        }
        return count+odd;
    }
}