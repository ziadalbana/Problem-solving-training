class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        res.add(Arrays.asList(1));
        for(int i=1;i<numRows;i++){
            res.add(new ArrayList<>());
            res.get(i).add(1);
            for(int j=0;j<i-1;j++){
                int num=res.get(i-1).get(j)+res.get(i-1).get(j+1);
                res.get(i).add(num);
            }
            res.get(i).add(1);
        }
        return res;
    }
}