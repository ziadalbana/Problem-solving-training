class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList();
        backtrack(1,n,k,ans,new ArrayList());
        
        return ans;
    }
    private void backtrack(int x,int n,int k,List<List<Integer>> ans,ArrayList<Integer> temp){
        if(temp.size()==k) ans.add(new ArrayList<>(temp));
        else {
            for(int i=x;i<=n;i++){
                if(temp.contains(i)) continue;
                temp.add(i);
                backtrack(i+1,n,k,ans,temp);
                temp.remove(temp.size()-1);
            }
        }
    }
}