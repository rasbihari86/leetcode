import java.util.HashMap;

public class longestSubstringWithoutRepeatingCharacters {
    public static int longestSubstring(String str){
        HashMap<Character,Integer>map = new HashMap<>();
        int left = 0;
        int right = 0;
        int maxlen = 0;
        while(right<str.length()){
            if(map.containsKey(str.charAt(right)) && map.get(str.charAt(right))>= left){
                left = map.get(str.charAt(right)) +1;
                map.put(str.charAt(right),right);

            }
            map.put(str.charAt(right),right);
            maxlen = Math.max(right-left+1,maxlen);
            right++;



        }
        return maxlen;
    }
    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(longestSubstring(str));
    }
}
