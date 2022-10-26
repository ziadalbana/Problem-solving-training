class Solution {
  public int evalRPN(String[] tokens) {
    Stack<Integer> res=new Stack<>();
    for(String s:tokens){
        if( s.equals("+")){
          int sec=res.pop();
          int first=res.pop();
          res.push(first+sec);
        }else if( s.equals("-")){
          int sec=res.pop();
          int first=res.pop();
          res.push(first-sec);
        }else if( s.equals("*")){
          int sec=res.pop();
          int first=res.pop();
          res.push(first*sec);
        }
        else if( s.equals("/")){
          int sec=res.pop();
          int first=res.pop();
          res.push(first/sec);
        }else res.push(Integer.parseInt(s));
    }
     return res.pop(); 
  
  }
}