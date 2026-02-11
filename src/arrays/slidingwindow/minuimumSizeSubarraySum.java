package arrays.slidingwindow;

public class minuimumSizeSubarraySum {
    public  static  int minSubarrayLen(int [] arr , int target){
    int minlen = Integer.MAX_VALUE;
     int left = 0 ;

     int sum = 0;
     for(int right = 0 ; right <arr.length ; right++) {
         sum = sum + arr[right];
         while (sum>=target) {

                 minlen = Math.min(minlen, right - left + 1);
                 sum = sum - arr[left];
                 left++;



         }
     }
     if(minlen==Integer.MAX_VALUE){
         return 0;
     }else{
         return minlen;
     }
    }
    public static void main(String[] args) {
        int [] arr = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(minSubarrayLen(arr,target));
    }
}
