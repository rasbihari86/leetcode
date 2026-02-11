package arrays;

public class twoSumInSortedArray {
    public static int [] twoSum(int [] nums, int target ){
        int [] arr = new int[2];

        int n = nums.length;
        int left = 0;
        int right = nums.length-1;
        while(left<right){
            if(nums[left]+nums[right]==target){
                arr[0]=left+1;
                arr[1]=right+1;
                return arr;
            }
            else if(nums[left]+nums[right]<target){
                left++;
            }else{
                right--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int [] nums = {2,3,4};
        int target = 6 ;
        int [] result = twoSum(nums,target);
        for(int n : result){
            System.out.print(n);
        }

    }
}
