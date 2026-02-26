package arrays;

public class sortcolors75leetcode {
    public static  void sorted( int [] nums){
        int count = 0;
        for( int i = 0 ; i< nums.length ; i++){
            if(nums[i]==0){
                int temp = nums[count];
                nums[count]=0;
                nums[i] = temp;
                count++;
            }
        }
        for(int j = count ; j<nums.length ; j++){
            if(nums[j]==1){
                int temp = nums[count];
                nums[count]=1;
                nums[j] = temp;
                count++;
            }
        }
        for(int n : nums){
            System.out.print(n);
        }
    }
    public static void main(String[] args) {
        int [] arr = {2 , 0 , 2 ,1 , 1 ,0};
        sorted(arr);
    }
}
