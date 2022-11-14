class Solution {
    public String decodeString(String s) {
        Stack<String> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        int idx=0;
        String res="";
        while(idx<s.length()){
            if(Character.isDigit(s.charAt(idx))){
                int num=s.charAt(idx++)-'0';
                while(Character.isDigit(s.charAt(idx))){
                    num=(num*10)+(s.charAt(idx)-'0');
                    idx++;
                }
                s2.push(num);
            }else if(s.charAt(idx)=='['){
                s1.push(res);
                res="";
                idx++;
            }else if(s.charAt(idx)==']'){
                StringBuilder temp=new StringBuilder(s1.pop());
                int num=s2.pop();
                for (int i = 0; i < num; i++) {
                    temp.append(res);
                }
                res=temp.toString();
                idx++;
            }else{
                res+=s.charAt(idx++);
            }
        }
        return res;
    }   
}