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
       // int index1=str1.length()-1,index2=str2.length()-1;
       //  while(index1>=0||index2>=0){
       //      int c1=0,c2=0;
       //      while(str1.charAt(index1)=='#') {
       //          c1++;
       //          index1--;
       //      }
       //      while(str2.charAt(index2)=='#') {
       //          c2++;
       //          index2--;
       //      }
       //      index1-=(c1);index2-=(c2);
       //      if(str1.charAt(index1)!=str2.charAt(index2)) return false;
       //      index1--;index2--;
       //  }
       //  return true;
    }
}