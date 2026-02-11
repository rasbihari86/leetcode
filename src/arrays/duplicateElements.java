package arrays;

import java.util.ArrayList;
import java.util.List;

public class duplicateElements {
    public static boolean isvisited(int [] nums){
        List<Integer> visited = new ArrayList<>();
        for(int i = 0 ; i< nums.length; i++){
            if(visited.contains(nums[i])){
                return true;
            }else{
                visited.add(nums[i]);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,1,5};
        System.out.println(isvisited(arr));

    }
}
