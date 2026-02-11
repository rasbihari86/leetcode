package arrays.slidingwindow;

public class BinarySubarrayWithSum {
    public static  int totalSubarrays(int [] nums , int k){
        int count = 0;
        int left = 0;
        int sum = 0;
        for ( int right = 0 ; right<nums.length ; right ++){
            sum = sum + nums[right];
            if(sum<=k){
                count++;
            } else if (sum>k) {
                sum = sum - nums[left];
                left++;

            }
        }
        return  count;
    }
    public static void main(String[] args) {
        int [] nums  = {1,0,1,0,1};
        System.out.println(totalSubarrays(nums, 2));
    }
}
