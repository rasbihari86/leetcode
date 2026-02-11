package Strings;

public class MergeStringAlternatively {
    public static String merged(String word1, String word2){
        StringBuilder sb = new StringBuilder();
        int first = 0;
        int second = 0;
        while(first<word1.length()||second<word2.length()){
            if(first<word1.length()&&second<word2.length()){
                sb.append(word1.charAt(first));
                sb.append(word2.charAt(second));
                first++;
                second++;
            }else if(first<word1.length()){
                sb.append(word1.charAt(first));
                first++;
            }else {
                sb.append(word2.charAt(second));
                second++;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String word1 = "abcd";
        String word2 ="pq";
        System.out.println(merged(word1,word2));
    }
}
