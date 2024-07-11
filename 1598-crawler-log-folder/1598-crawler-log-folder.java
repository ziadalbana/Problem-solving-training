class Solution {
    public int minOperations(String[] logs) {
        int count=0;
        for(String c:logs){
            if(c.equals("../")) {
                if(count>0) count--;
            }
            else if(c.equals("./")) continue;
            else count++;    
        }
        return count;
    }
}