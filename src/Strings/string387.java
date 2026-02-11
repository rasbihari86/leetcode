package Strings;

public class string387 {
    public static int indec(String str){
        int [] freq = new int[26];// frequency array for 26 lowercase letters (a-z)
        char []ch = str.toCharArray(); //convert string to char array

        // Step 1: Count frequencies of each character
        for(char c : ch){
            freq[c-'a']++; // Example: 'c' - 'a' = 2 → freq[2]++
        }
        //Step 2: Find the first character with frequency == 1
        for(int i = 0 ; i< ch.length;i++){
            if(freq[ch[i]-'a']==2){
                return i;  // return index of first non-repeating character

            }
        }return 0;// if no unique character found
    }
    public static void main(String[] args) {
        String str = "bavcdd";
        System.out.println(indec(str));
    }
}
