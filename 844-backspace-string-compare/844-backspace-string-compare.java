class Solution {
   public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1=new Stack();
        Stack<Character> t1=new Stack();
        for(int i=0;i<s.length();i++){
            if(!s1.isEmpty()&&s.charAt(i)=='#') s1.pop();
            else if(s.charAt(i)!='#') s1.add(s.charAt(i));
        }
        for(int i=0;i<t.length();i++){
            if(!t1.isEmpty()&&t.charAt(i)=='#') t1.pop();
            else if(t.charAt(i)!='#') t1.add(t.charAt(i));
        }
        if(t1.size()!=s1.size()) return false;
        else{
            while (!s1.isEmpty()) if(s1.pop()!=t1.pop()) return false;
        }
        return true;
    }
}