package arrays.slidingwindow;

import java.util.HashMap;

public class LongestRepeatingCharacterReplacement {
    public static  int longestsubstring(String str  , int k){
        HashMap<Character, Integer> map = new HashMap<>();
        int maxlen = 0;
        int left = 0;
        int maxfreq = 0;

        for(int right = 0 ; right <str.length() ; right++){
            map.put(str.charAt(right), map.getOrDefault(str.charAt(right),0)+1);
            maxfreq = Math.max(maxfreq,map.get(str.charAt(right)));




            while ((right-left+1)-maxfreq >k) {
                map.put(str.charAt(left),map.get(str.charAt(left))-1);
                left++;
            }
            int currentLen = right-left+1;
            maxlen = Math.max(currentLen,maxlen);

        }
        return  maxlen;

    }

    public static void main(String[] args) {
        String str= "AABABBA";
        System.out.println(longestsubstring(str,1));
    }
}
