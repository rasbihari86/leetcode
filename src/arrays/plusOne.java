package arrays;

public class plusOne {
    public static int[] plusonearr(int [] digits){
        int n = digits.length;
        for(int i = n-1 ; i>=0 ; i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;  // no carry, return early
            }
            digits[i]=0; //if current digit is 9
        }
        // If we reach here, all digits were 9 → need extra space
        int [] newdigits = new int[n+1];
        newdigits[0]=1;
        return newdigits;

    }
    public static void main(String[] args) {
        int [] arr = {1,9,9,9};
        int [] result = plusonearr(arr);
        for(int n : result){
            System.out.print(n);
        }

    }
}
