class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       int[] map=new int[26];
        for(char c:magazine.toCharArray()) map[c-97]++;
        for(char c:ransomNote.toCharArray()) map[c-97]--;
        for(int i=0;i<26;i++) {
            if(map[i]<0) return false;
        }
        return true;
    }
}