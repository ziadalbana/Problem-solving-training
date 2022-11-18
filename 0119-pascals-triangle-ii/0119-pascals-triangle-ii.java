class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> first= Arrays.asList(1);
        List<Integer> second=new ArrayList<>();
        if(rowIndex==0) return first;
        for(int i=1;i<=rowIndex;i++){
            second.add(1);
            for(int j=1;j<first.size();j++){
                second.add(first.get(j-1)+first.get(j));
            }
            second.add(1);
            first=second;
            second=new ArrayList<>();
        }
        return first;

    }
}