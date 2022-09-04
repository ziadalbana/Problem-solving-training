class Solution {
//    version 1 
/*    public List<String> letterCasePermutation(String s) {
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
 */
     public List<String> letterCasePermutation(String str){
    List<String> permutations = new ArrayList<>();
    // TODO: Write your code here
    permutations.add(str);
    for(int i=0;i<str.length();i++){
      int n=permutations.size();
      if(!Character.isLetter(str.charAt(i))) continue;
      for(int j=0;j<n;j++){
        char[] temp=permutations.get(j).toCharArray();
        if(Character.isUpperCase(temp[i])) temp[i]=Character.toLowerCase(temp[i]);
        else  temp[i]=Character.toUpperCase(temp[i]);
        permutations.add(new String(temp));
      }
    }
    return permutations;
     }
}