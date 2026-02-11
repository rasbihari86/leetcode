package arrays;
//Given a binary array nums, you should delete one element from it.
//
//Return the size of the longest non-empty subarray containing only 1's in the resulting array. Return 0 if there is no such subarray.
//


public class leetcode1493 {
    public static  int longestSubarray(int [] nums){
        int LongestSubarray=0;
        int removeCount = 0;
        int start = 0;
        for(int end = 0 ; end < nums.length ; end++){
            if(nums[end]==0){
                removeCount++;

            }
            while(removeCount>1){
                if(nums[start]==0) {

                    removeCount--;

                }
                start++;
            }

            LongestSubarray = Math.max(LongestSubarray,end - start);


        }
        return LongestSubarray;
    }
    public static void main(String[] args) {
        int [] arr = {0,1,1,1,0,1,1,0,1};
        System.out.println(longestSubarray(arr));
    }
}
