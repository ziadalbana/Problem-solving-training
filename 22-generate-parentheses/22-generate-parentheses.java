class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        traverse(res,n,"",0,0);
        return res;
    }
    private void traverse( List<String> res,int n,String temp,int open,int close){
        if(temp.length()==2*n) {
            res.add(temp);
            return;
        }
        if(open<n) traverse(res,n,temp+"(",open+1,close);
        if(open>close) traverse(res,n,temp+")",open,close+1);
    }
}