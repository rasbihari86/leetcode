package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode1431 {
    public static List<Boolean> solution(int [] candies , int extracandoes){
        List<Boolean> list  = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i< candies.length ; i++){
            if(candies[i]>max){
                max = candies[i];
            }

        }

        for(int i = 0 ; i< candies.length ; i ++){
            if(candies[i]+extracandoes>= max){
                list.add(true);

            }else {
                list.add(false);
            }


        }
        return list;


    }
    public static void main(String[] args) {
        int arr[] = {2,3,5,1,3};
        int candies = 3;
        System.out.println(solution(arr,candies));

    }
}
