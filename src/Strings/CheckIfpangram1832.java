package Strings;

public class CheckIfpangram1832 {
    public static boolean isPangram(String sentence){
        char [] ch = sentence.toCharArray();
        int [] freq  = new int[26];
        for(char c : ch){
            freq[c-'a']++;

        }
        for(int i = 0; i< freq.length;i++){
            if(freq[i]<1){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String sentence ="thequickbrownfoxjumpsoverthelazydog";
        System.out.println(isPangram(sentence));
    }
}
