package febChallenge;

import java.util.HashMap;

public class PermutationinString {
    public static void main(String[] args) {
        PermutationinString s=new PermutationinString();
      System.out.println(s.checkInclusion("adc","dcda"));
    }
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> mapS1=new HashMap<>();
        HashMap<Character,Integer> mapS2=new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char s=s1.charAt(i);
            if (mapS1.containsKey(s)) mapS1.put(s,mapS1.get(s)+1);
            else mapS1.put(s,1);
        }
        for (int i = 0; i <= s2.length()-s1.length(); i++) {
            char s=s2.charAt(i);
            if (mapS1.containsKey(s)){
                for (int j = i; j < i+s1.length();j++) {
                    s=s2.charAt(j);
                    if (mapS1.containsKey(s)){
                        if (mapS2.containsKey(s)) mapS2.put(s,mapS2.get(s)+1);
                        else mapS2.put(s,1);
                    }else break;
                }
                if (mapS1.size()==mapS2.size()){
                    int count=0;
                    for (int k = 0; k < mapS1.size(); k++) {
                        s=s1.charAt(k);
                        if (mapS1.get(s)==mapS2.get(s))  count++;
                        else break;
                        if (count==mapS2.size()) return true;
                    }
                }
                mapS2=new HashMap<>();
            }
        }
        return false;
    }
}
