package Strings;

public class leetcode345 {
    public static String solution(String str){

        char[] arr = str.toCharArray();
        int left = 0 ;
        int right = arr.length-1;
        while (left<right){
            while(left<right && !isVowel(arr[left])){
                left++;
            }
            while (left<right&&!isVowel(arr[right])){
                right--;
            }
            char temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }

        return new String(arr);
    }
    public static boolean isVowel(char c){
        String vowels = "AEIOUaeiou";
        if(vowels.contains(c+"")) {
            return true;
        }else{
            return false;
        }

    }
    public static void main(String[] args) {
        String str = "IceCreAm";
        System.out.println(solution(str));
    }
}
