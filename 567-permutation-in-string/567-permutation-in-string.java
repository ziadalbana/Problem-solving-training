class Solution {
       public boolean checkInclusion(String s1, String s2) {
	    if(s1.length() > s2.length()) return false;
        HashMap<Character,Integer> map =new HashMap<>();
    for(int i=0;i<s1.length();i++) map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
    int windowStart=0;
    int matched=0;
    for(int windowEnd=0;windowEnd<s2.length();windowEnd++){
        char r=s2.charAt(windowEnd);
        if(map.containsKey(r)){
          map.put(r,map.get(r)-1);
          if(map.get(r)==0) matched++;
        }
        if(matched==map.size()) return true;
        if(windowEnd>=s1.length()-1){
          char l=s2.charAt(windowStart++);
          if(map.containsKey(l)){
             if(map.get(l)==0) matched--;
             map.put(l,map.get(l)+1);
          }
        }
    }
    return false;   
        
//         int[] arr1 = new int[26];
//         int[] arr2 = new int[26];
        
//         for(int i = 0; i < s1.length(); i++){
//             arr1[s1.charAt(i) - 'a']++;
//             arr2[s2.charAt(i) - 'a']++;
//         }
        
//         if(Arrays.equals(arr1, arr2)) return true;
        
//         int front = 0;
//         int back = s1.length();
//         while(back < s2.length()){
//             arr2[s2.charAt(front) - 'a']--;
//             arr2[s2.charAt(back) - 'a']++;
            
//             if(Arrays.equals(arr1, arr2)) return true;
//             front++;
//             back++;
//         }
//         return false;
    }
    // public boolean checkInclusion(String s1, String s2) {
    //     HashMap<Character,Integer> mapS1=new HashMap<>();
    //     HashMap<Character,Integer> mapS2=new HashMap<>();
    //     for (int i = 0; i < s1.length(); i++) {
    //         char s=s1.charAt(i);
    //         if (mapS1.containsKey(s)) mapS1.put(s,mapS1.get(s)+1);
    //         else mapS1.put(s,1);
    //     }
    //     for (int i = 0; i <= s2.length()-s1.length(); i++) {
    //         int j;
    //         char s=s2.charAt(i);
    //         if (mapS1.containsKey(s)){
    //             for (j = i; j < i+s1.length();j++) {
    //                 s=s2.charAt(j);
    //                 if (mapS1.containsKey(s)){
    //                     if (mapS2.containsKey(s)) mapS2.put(s,mapS2.get(s)+1);
    //                     else mapS2.put(s,1);
    //                 }else break;
    //             }
    //             if (mapS1.size()==mapS2.size()){
    //                 int count=0;
    //                 for (int k = 0; k < mapS1.size(); k++) {
    //                     s=s1.charAt(k);
    //                     if (mapS1.get(s)==mapS2.get(s))  count++;
    //                     else {
    //                         break;
    //                     };
    //                     if (count==mapS2.size()) return true;
    //                 }
    //             }
    //             mapS2=new HashMap<>();
    //         }
    //     }
    //     return false;
    // }
}