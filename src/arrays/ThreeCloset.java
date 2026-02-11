package arrays;

import java.util.Arrays;

public class ThreeCloset {
    public static int closet(int [] nums, int target){
        Arrays.sort(nums);
        int n = nums.length;
        int firstcloset  = nums[0]+nums[1]+nums[2];
       int  closet = Math.abs(firstcloset-target);
       int minsum = 0;



        for(int i = 0; i< nums.length-2;i++){
            int right = n-1;
            int left = i+1;
            while (left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum==target){
                    return sum;
                }
                int diff = Math.abs(sum-target);


                    if(diff<closet){
                        closet=diff;
                        minsum=sum;
                    }

                if(sum>target){right--;}
                else {left++;}


            }


        }
        return minsum;
        }

    public static void main(String[] args) {
        int [] nums = {-1,2,1,-4};
        System.out.println(closet(nums,1));

    }
}
