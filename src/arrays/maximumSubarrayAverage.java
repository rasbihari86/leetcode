package arrays;

public class maximumSubarrayAverage {
    public static double findmaxAverage(int [] nums, int t) {
        int sum = 0;
for(int i = 0 ; i<t ; i++){
   sum = sum +nums[i];
}
int maxsum = sum;
int start = 0 ;
int end = t;
while (end<nums.length){
    sum = sum - nums[start];
    start++;
    sum = sum + nums[end];
    end++;
    maxsum = Math.max(sum,maxsum);

}
return (double) maxsum/t;



    }
    public static void main(String[] args) {
        int [] nums = {1,12,-5,-6,50,3};
        int t = 4;
        System.out.println(findmaxAverage(nums,t));

    }
}
