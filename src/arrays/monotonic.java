package arrays;

public class monotonic {
    public static boolean monotonicOrnot(int [] nums){
        boolean increasing = true ;
        boolean decreasing = true;
        for(int i  =1 ; i<nums.length; i++){
            if(nums[i-1]<nums[i]){
                decreasing = false;
            }else if (nums[i-1]>nums[i]) {
                increasing = false;

            }
            if(decreasing==true && increasing==true){
                return false;
            }
        }
        if(increasing==true &&decreasing==false){
            return true;
        }else if(decreasing==true && increasing==false){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        int arr [] = {1,2,3,2};
        System.out.println(monotonicOrnot(arr));
    }
}
