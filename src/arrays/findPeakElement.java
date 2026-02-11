package arrays;

public class findPeakElement {
    public static int peakElement(int [] nums){
        int lastIndex = nums.length-1;
        if(nums.length==1){
            return 0;
        }
        if(nums[lastIndex]>nums[lastIndex-1]){
            return lastIndex;
        } else if (nums[0]>nums[1]) {
            return 0;

        }
        int start =   0;
        int end = lastIndex;
        while (start < end){
            int mid = (start+end)/2;
            if(nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1]){
                return mid;
            } else if (nums[mid+1]>nums[mid]) {
                start = mid + 1;

            }else{
                end = mid -1;
            }
        }
        return -1;



    }
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        System.out.println(peakElement(arr));
    }
}
