package Strings;
//LEETCODE 151
public class reverseEveryWord {
//REVERSE EVERY WORD FROM STRING

    public static String reverseWords(String s) {
        String [] arr = s.split(" +");  // split by multiple spaces
        StringBuilder sb = new StringBuilder();

        for(int i = arr.length-1; i >= 0; i--){
            sb.append(arr[i]);
            sb.append(" ");
        }

        return sb.toString().trim();  // remove last extra space
    }

    public static void main(String[] args) {
        String s = "rasbihari is a good boy  \" ";
        System.out.println(reverseWords(s));
    }
}
