class Solution {
    public int maxVowels(String s, int k) {
        HashSet<Character> set=new HashSet<>(Arrays.asList('a','e','i','o','u'));
        int max=Integer.MIN_VALUE;
        int start=0;
        int count=0;
        for(int end=0;end<s.length();end++){
            char c=s.charAt(end);
            if(set.contains(c)) count++;
            if(end+1>=k){
                max=Integer.max(max,count);
                char cStart=s.charAt(start++);
                if(set.contains(cStart)) count--;
            }
        }
        return max;
    }
}