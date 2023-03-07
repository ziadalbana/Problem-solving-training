class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
         generate(0,0,res,"",n);
        return res;
    }
    public void generate(int left,int right,List<String> res,String val,int n){
        if(val.length()==2*n){
            res.add(val);
            return;
        }
        if(left<n) generate(left+1,right,res,val+"(",n);
        if(left>right) generate(left,right+1,res,val+")",n);
    }
}