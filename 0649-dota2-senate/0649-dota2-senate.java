class Solution {
    public String predictPartyVictory(String senate) {
        int r=0,d=0;
        int l=senate.length();
        boolean[] banned=new boolean[l];
        for(char c:senate.toCharArray()){
            if(c=='R') r++;
            else d++;
        }
        int i=0;
        while(r>0&&d>0){
            if(!banned[i]){
                char c=senate.charAt(i);
                if(c=='R'){
                    searchForNext(banned,(i+1)%l,'D',senate);
                    d--;
                }else{
                    searchForNext(banned,(i+1)%l,'R',senate);
                    r--;
                }
            }
            i=(i+1)%l;
        }
        return d==0? "Radiant":"Dire"; 
    }
    private void searchForNext( boolean[] banned,int i,char target,String senate){
        while(true){
            char c=senate.charAt(i);
            if(c==target&&!banned[i]){
                banned[i]=true;
                break;
            }
            i=(i+1)%senate.length();
        }
    }
}