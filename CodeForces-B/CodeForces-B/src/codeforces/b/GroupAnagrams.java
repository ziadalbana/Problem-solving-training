package codeforces.b;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
      String[] input=new String[]{"eat","tea","tan","ate","nat","bat"};
      solution(input);
    }
    public static List<List<String>> solution(String[] strs){
        HashMap<String,List<String>> result =new HashMap<>();
        List<List<String>> Strings=new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            int ascicode=0;
            char[] arr=strs[i].toCharArray();
            Arrays.sort(arr);
            String temp=new String(arr);
            if(result.containsKey(temp)) {
                result.get(temp).add(strs[i]);

            }else{
                result.put(temp,new ArrayList<>());
                result.get(temp).add(strs[i]);
            }
        }
        for (List<String> list: result.values()) {
            Strings.add(list);
        }
        return Strings;
    }
}
