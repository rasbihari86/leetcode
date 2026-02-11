package arrays;

public class majorityElement169 {
    public static int majority(int [] nums){
        int count = 0;
        int candiate = 0;
        for(int i = 0; i<nums.length;i++){
            if(count ==0){
                candiate=nums[i]; //IT ALWAYS RUNS FIRSTLY BECAUSE INTIALLY COUNT IS 0


            }if(nums[i]==candiate){ //
                count++;
            }else{
                count--;
            }
        }
        count= 0;
        for(int i = 0; i<nums.length;i++){
            if(candiate==nums[i]){
                count++;
            }
        }
        if(count >nums.length/2){
            return candiate;
        }
        return -1;



    }
    public static void main(String[] args) {
        int[] nums = {1,2,1,1,2,1,1,2,3,1,5,1};
        System.out.println(majority(nums));
    }
}
//✅ Problem
//
//Find the element that appears more than n/2 times.
//
//        Example:
//arr = [2, 2, 1, 1, 1, 2, 2]
//Answer = 2 (because it appears 4 times, and n/2 = 3).
//
//        ✅ Moore’s Voting Algorithm Intuition
//
//Think of it like an election:
//
//Every number is a candidate.
//
//They fight with each other.
//
//If the same number appears → it gets +1 vote.
//
//If a different number comes → they cancel each other’s vote.
//
//In the end, the majority element survives because it has more than half votes.
//
//✅ Step by Step Example
//
//Array: [2, 2, 1, 1, 1, 2, 2]
//We keep two things:
//
//candidate → current winner
//
//count → votes for the candidate
//
//Start: count = 0, candidate = None
//
//First element = 2
//        Since count = 0, set candidate = 2, count = 1.
//
//        👉 candidate = 2, count = 1
//
//Next element = 2
//Same as candidate, so count = 2.
//
//👉 candidate = 2, count = 2
//
//Next element = 1
//Different from candidate, so cancel one vote → count = 1.
//
//        👉 candidate = 2, count = 1
//
//Next element = 1
//Different again → cancel one vote → count = 0.
//
//        👉 candidate = 2, count = 0
//
//Next element = 1
//Since count = 0, new candidate = 1, count = 1.
//
//        👉 candidate = 1, count = 1
//
//Next element = 2
//Different, cancel → count = 0.
//
//        👉 candidate = 1, count = 0
//
//Last element = 2
//        Since count = 0, set candidate = 2, count = 1.
//
//        👉 candidate = 2, count = 1
//
//        ✅ Final candidate = 2
//
//Now, just check if 2 appears more than n/2.
//
//Count(2) = 4
//
//n/2 = 3
//
//        4 > 3 → ✅ Majority element = 2
