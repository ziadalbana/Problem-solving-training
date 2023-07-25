class Solution {
    public String reverseWords(String s) {
        String[] words=s.trim().split("\\s+");
        StringBuilder res=new StringBuilder();
        for(int i=words.length-1;i>0;i--){
            res.append(words[i]);
            res.append(" ");
        }
        res.append(words[0]);
        return res.toString();
    }
}