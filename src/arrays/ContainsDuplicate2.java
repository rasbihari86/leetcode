package arrays;

import java.util.HashMap;

public class ContainsDuplicate2 {
    public static boolean containsDuplicate(int [] nums,int k){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0 ; i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int result = (map.get(nums[i]) - i)*-1;
                if(result<=k){
                    return true;
                }

            }else{
                map.put(nums[i],i);
            }

        }
        return false;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,1};
        int k = 3;
        System.out.println(containsDuplicate(arr,k));
    }
}
