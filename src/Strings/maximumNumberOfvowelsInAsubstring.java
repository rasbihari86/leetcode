package Strings;

import java.util.HashSet;

public class maximumNumberOfvowelsInAsubstring {
    public static int maxNoofvowels( String s , int k){
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        int vowelsCount = 0;
        int maxcount = 0;
        for(int i = 0 ; i<k ; i++) {
            if (set.contains(s.charAt(i))) {
                vowelsCount++;

            }
        }
            maxcount=vowelsCount;
            int start  = 0;
            int end =k ;
            while (end <s.length()){
                if(set.contains(s.charAt(start))){
                    vowelsCount--;
                }
                start++;
                if(set.contains(s.charAt(end))){
                    vowelsCount++;
                }
                end++;
                maxcount = Math.max(vowelsCount,maxcount);

            }

        return maxcount;
    }
    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
        System.out.println(maxNoofvowels(s,k));
    }
}
