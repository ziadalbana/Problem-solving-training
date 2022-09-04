class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='(') stack.add(')');
            else if(c=='{') stack.add('}');
            else if(c=='[') stack.add(']');
            else if(stack.isEmpty()||stack.pop()!=c) return false;
        }
        return stack.isEmpty();
    }
}