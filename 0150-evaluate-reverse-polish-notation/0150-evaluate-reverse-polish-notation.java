class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(String token:tokens){
            if(token.equals("+")){
                int f2=stack.pop();
                int f1=stack.pop();
                stack.add(f1+f2);
            }else if(token.equals("-")){
                int f2=stack.pop();
                int f1=stack.pop();
                stack.add(f1-f2);
            }else if(token.equals("*")){
                int f2=stack.pop();
                int f1=stack.pop();
                stack.add(f1*f2);
            }else if(token.equals("/")){
                int f2=stack.pop();
                int f1=stack.pop();
                stack.add(f1/f2);
            }else {
                stack.add(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}