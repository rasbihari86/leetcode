package arrays;

public class pro136SingleNumber {
    public static int singlenum(int[]nums){
        for(int i = 0;i< nums.length;i++){
            if(nums.length>1) {
                for (int j = i + 0; j < nums.length; j++) {
                    if (nums[i] != nums[j]) {
                        return nums[i];

                    }
                }
            }
        }
        return nums[0];
    }
    public static void main(String[] args) {
        int [] nums = {2,2,1};
        System.out.println(singlenum(nums));

    }
}
