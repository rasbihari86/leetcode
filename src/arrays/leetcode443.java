package arrays;

public class leetcode443 {
    public static int compression( char [] chars ){
       int n = chars.length;
       int index = 0;
       int count = 1;
       for(int i = 0 ; i<n ;i++){

           if(i<n-1 && chars[i]==chars[i+1]){
               count++;
           }else {
               if(count==1){
                   chars[index++]=chars[i];
               }else {
                   String str = Integer.toString(count);
                   chars[index++]=chars[i];
                   char[] ch = str.toCharArray();
                   for (char c : ch){
                       chars[index++]=c;
                   }
                   count=1;
               }
           }
       }
       return index;

    }
    public static void main(String[] args) {
        char [] arr = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.println(compression(arr));
    }
}
