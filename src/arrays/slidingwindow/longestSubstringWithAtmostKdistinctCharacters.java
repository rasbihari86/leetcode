package arrays.slidingwindow;

import java.util.HashMap;
import java.util.HashSet;

public class longestSubstringWithAtmostKdistinctCharacters {
    public static int longestSubstring(String s,int k) {
        HashMap <Character,Integer> map = new HashMap<>();
        int left = 0;
        int maxlen = 0;
        for(int right = 0 ; right<s.length(); right++){
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right),0)+1);
            while (map.size()>k){
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                if(map.get(s.charAt(left))==0){
                    map.remove(s.charAt(left));

                }
                left++;
            }
            maxlen = Math.max(maxlen,right-left+1);

        }
        return maxlen;
    }
    public static void main(String[] args) {
        String str = "eceba";

        int k = 2;
        System.out.println(longestSubstring(str,2));
    }
}
