class Solution {
    public String reverseVowels(String s) {
        HashSet<Character> set=new HashSet<>(){{add('a');add('e');add('i');add('o');add('u');
  add('A');add('E');add('I');add('O');add('U');}};
        char[] letters=s.toCharArray();
        int l=0,r=letters.length-1;
        while(l<r){
            boolean left=set.contains(letters[l]);
            boolean right=set.contains(letters[r]);
            if(left&&right){
                char t=letters[l];
                letters[l]=letters[r];
                letters[r]=t;
                r--;l++;
            }else if(left) r--;
            else l++;
        }
    return new String(letters);
}
}