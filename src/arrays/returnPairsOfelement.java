package arrays;

import java.util.ArrayList;
import java.util.List;

public class returnPairsOfelement {
    public static void main(String[] args) {
        List<List<Integer>> listt = new ArrayList<>();

        int arr [] = {1,2,2,3};
        for(int i = 0 ; i<arr.length ; i++){
            for(int j = i+1 ; j< arr.length; j++){
                if(arr[i]+arr[j] == 4){
                    List<Integer>innerList = new ArrayList<>();
                    innerList.add(arr[i]);
                    innerList.add(arr[j]);
                    listt.add(innerList);
                }
            }
        }
        System.out.println(listt);
    }
}
