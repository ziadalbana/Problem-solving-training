class Solution {
    public boolean halvesAreAlike(String s) {
        HashSet<Character> set=new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        s=s.toLowerCase();
        int n=s.length()/2;
        String a=s.substring(0,n);
        String b=s.substring(n);
        int c1=0,c2=0;
        for(char c:a.toCharArray()) if(set.contains(c)) c1++;
        for(char c:b.toCharArray()) if(set.contains(c)) c2++;
        return (c1==c2)? true:false;
    }
}