package arrays;

public class jumpGame2 {
    public static int jump(int[] nums) {
        if(nums.length==1)return 0;
        int maxIndex = 0;
        int lastIndex = nums.length-1;
        int count = 0;
       int i = 0;

       while (i< nums.length) {
           int currentsum = nums[i] + i;
           if (currentsum > maxIndex) {
               maxIndex = currentsum;
               i = maxIndex;
               count++;
               i++;
           }


           if (maxIndex >= lastIndex) {
               return count;
           }
       }
       return count;




    }

    public static void main(String[] args) {
        int [] arr = {7,0,9,6,9,6,1,7,9,0,1,2,9,0,3};
        System.out.println(jump(arr));
    }
}
