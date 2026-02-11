package arrays.slidingwindow;

import java.util.HashMap;
//BRUTE FORCE APPROCH

public class NumberOfSubstringContainingAllThreeCharacters {
    public static int numberOfSubstring(String str ){
        int count = 0;
        for(int i = 0; i<str.length() ; i++){
            HashMap<Character,Integer> map = new HashMap<>(3);

            for(int j = i; j<str.length();j++){
                map.put(str.charAt(j),1);
                if(map.getOrDefault('a',0)+map.getOrDefault('b',0)+ map.getOrDefault('c',0)==3){
                    count++;
                }

            }
        }
        return count;

    }

    public static void main(String[] args) {
        String str = "abcabc";
        System.out.println(numberOfSubstring(str));
    }
}
