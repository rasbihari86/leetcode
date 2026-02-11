package arrays;

public class bestTimeTobuyAndSellStock2nd {
    public static int maxProfit(int [] nums ){
        int maxprofit = 0 ;

        for(int i = 1 ; i<nums.length ; i++){
            if(nums[i]>nums[i-1]){
                maxprofit = maxprofit +nums[i]-nums[i-1];
            }

        }
        if(maxprofit>0){
            return maxprofit;

        }else {
            return -1;
        }
    }
    public static void main(String[] args) {
        int  [] nums = {};
        System.out.println(maxProfit(nums));
    }
}
