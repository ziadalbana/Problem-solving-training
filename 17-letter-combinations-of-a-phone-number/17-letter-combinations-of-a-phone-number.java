class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0) return new ArrayList<>();
        HashMap<Character,String> map=new HashMap<>();
        List<String> res=new ArrayList<>();
        intilazeMap(map);
        traverse(map,digits,res,0,"");
        return res;
    }
    private void traverse( HashMap<Character,String> map,String digits, List<String> res,int pos,String result){
        if(pos>=digits.length()) {
            res.add(result);
            return;
        }
        String word=map.get(digits.charAt(pos));
        for(int i=0;i<word.length();i++){
            traverse(map,digits,res,pos+1,result+word.charAt(i));
        }
        
        
    }
    private void intilazeMap( HashMap<Character,String> map){
        map.put('1',"");
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
    }
}