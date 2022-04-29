package easy;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Stack;

public class ReverseWordsinaStringIII {
    public static void main(String[] args) {
        ReverseWordsinaStringIII M=new ReverseWordsinaStringIII();
        M.reverseWords("Let's take LeetCode contest");
    }
    public String reverseWords(String s){
        String[] line=s.split(" ");
        String result="";
        Hashtable<Character,Integer> indexs=new Hashtable<>();
//        indexs.containsKey()
        for(int i=0;i<line.length;i++){
            Stack<Character> reverse=new Stack();
            for(int j=0;j<line[i].length();j++){
                reverse.add(line[i].charAt(j));
            }
            while(!reverse.isEmpty()){
                result+=reverse.pop();
            }
            if(i< line.length-1) result+=" ";
        }
        return result;
    }
}
