class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        res.add(new ArrayList(){{add(1);}});
        int rows=1;
        while(rows<numRows){
          List<Integer> row=new ArrayList<>();
           List<Integer> lastRow=res.get(res.size()-1);
          for(int i=0;i<=lastRow.size();i++){
              if(i==0||i==lastRow.size()) row.add(1);
              else{
                 row.add(lastRow.get(i-1)+lastRow.get(i));
              }
          }
          res.add(row);  
          rows++;  
        }
       return res; 
    }
}