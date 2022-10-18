class Solution {
    public int romanToInt(String s) {
        HashMap<String,Integer> map=new HashMap<>();
        buildMap(map);
        int sum=0;
        for(int i=0;i<s.length();i++){
            String c=s.charAt(i)+"";
             if(i<s.length()-1&&(c.equals("I")||c.equals("X")||c.equals("C"))){
                char n=s.charAt(i+1);
                int temp=map.getOrDefault(c+n,0);
                if(temp==0){
                    sum+=map.get(c);
                }else{
                    sum+=temp;
                    i++;
                }
            }else sum+=map.get(c);
        }
        return sum;
        
    }
    private void buildMap(HashMap<String,Integer> map){
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        map.put("IV",4);
        map.put("IX",9);
        map.put("XL",40);
        map.put("XC",90);
        map.put("CD",400);
        map.put("CM",900); 
    }
}