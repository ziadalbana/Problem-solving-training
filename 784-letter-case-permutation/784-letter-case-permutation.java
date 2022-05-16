class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> result=new ArrayList();
        construct(result,s.toLowerCase(),0,"");
        return result;
    }
    private void construct(List<String> result,String s,int i,String temp){
        if(temp.length()==s.length()) {
            result.add(temp);
            return;
        }
        char ss=s.charAt(i);
        if(ss>='a'&&ss<='z'){
            construct(result,s,i+1,temp+""+ss);
            construct(result,s,i+1,temp+""+Character.toUpperCase(ss));
        }else{
             construct(result,s,i+1,temp+""+ss);
        }
        
    }
}