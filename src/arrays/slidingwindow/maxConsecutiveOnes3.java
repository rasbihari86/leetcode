package arrays.slidingwindow;

public class maxConsecutiveOnes3 {
    public static  int maxcommsecutive(int [] arr, int k ){
        int left = 0 ;
        int right = 0;
        int zeros  = 0;
        int maxlen = 0;

        for(right = 0 ; right <arr.length  ; right++){
            if(arr[right]==0){
                zeros++;

            }
            if(zeros<=k){
             maxlen = Math.max(right- left +1,maxlen);


            }

            while(zeros>k){

                if(arr[left]==0){
                    zeros--;
                }
                left++;
            }

        }
        return maxlen;
    }
    public static void main(String[] args) {
        int [] arr = {1,1,1,0,0,0,1,1,1,1,0};
        System.out.println(maxcommsecutive(arr, 2));
    }
}
