class Solution {
    public String reverseParentheses(String s) {
        Stack<Integer> stack=new Stack<>();
        StringBuilder res=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c=='(') stack.push(res.length());
            else if(c==')'){
                int start=stack.pop();
                reverse(res,start,res.length()-1);
            }else res.append(c);
        }
        return res.toString();
    }
    private void reverse(StringBuilder res,int x,int y){
        while(x<y){
            char c=res.charAt(x);
            res.setCharAt(x++,res.charAt(y));
            res.setCharAt(y--,c);
        }
        
    }
}