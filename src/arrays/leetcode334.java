package arrays;

public class leetcode334 {
    public static  boolean  solution(int [] nums){

        for(int i = 0 ; i< nums.length-2; i++){
            int second = i+1;
            int third = i+2;
            while (second< nums.length-1&&third<nums.length-2){
                if(nums[i]<nums[second]&&nums[second]<nums[third]){
                    return true;

                }else if(nums[i]>nums[second] && second< nums.length-1){
                    second++;
                    third++;


                }
                else if (nums[i]<nums[second] && third< nums.length-2) {
                    third++;

                }
            }

        }
        return false;

    }

    public static void main(String[] args) {
        int [] nums = {20,100,10,12,5,13};
        System.out.println(solution(nums));
    }
}
