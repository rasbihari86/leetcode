package arrays;

public class bstTimeToBuyandSellStocks {
    public static int profit(int [] sellingPrices){
        int buyingPric = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0; i<sellingPrices.length;i++){ //CASE 1
            if(buyingPric<sellingPrices[i]){  //IT RUNS WHEN BUYING PRICE IS LESS THSN SELLING PRICE
                                                         //IF BUYING PRICE IS GREATER THAN SELLING PRICE CASE 2 RUNS
                int profit = sellingPrices[i]-buyingPric;
                maxProfit= Math.max(maxProfit,profit);

            }else{
                buyingPric=sellingPrices[i]; //IT SHOWS WE BUY STOCKS AND IF IT IS LOWER THAN NEXT SELLING PRICE
                                             //CASE 1 RUNS
            }
        }
        if(maxProfit>0){
            return maxProfit;
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {
        int [] prices = {4,2,5,1,7};
        int prof = profit(prices);
        System.out.println(prof + " maxprofit");
    }

    public static class leetcode27 {
    //    Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
    //
    //    Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
    //
    //    Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
    //    Return k.


    //    class Solution {
    //        public int removeElement(int[] nums, int val) {
    //            int count = 0;
    //            for(int i = 0 ; i<nums.length;i++){
    //                if(nums[i]!=val){
    //                    nums[count]=nums[i];
    //                    count++;
    //                }
    //            }
    //            return count;
    //
    //        }
    //    }
    }
}
