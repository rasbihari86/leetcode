package arrays;

import java.util.Arrays;

public class NextPermutation {
    public static void solution(int [] nums){
        int pivot = -1;
        int n = nums.length;
        for(int i = n-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                pivot = i;
                break;
            }
        }
        if(pivot==-1){

               reverse(nums,0,n-1);

            return;
        }
        for(int k = n-1; k > pivot ;  k--){
            if(nums[k]>nums[pivot]){
                 swap(nums,pivot,k);
                 break;
            }
        }
        reverse(nums,pivot+1,n-1);


        for (int h : nums) {
            System.out.print(h);
        }

    }public static void reverse(int[]nums,int left , int right){
        while(left<right){
            swap(nums,left,right);
            left++;
            right--;
        }
    }
    public static void swap(int []nums, int left ,int right){
        int temp = nums[left];
        nums[left]= nums[right];
        nums[right]=temp;
    }







    public static void main(String[] args) {
        int[]arr = {1,2,5,4,3};
        solution(arr);
    }
}
