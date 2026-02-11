package arrays.slidingwindow;

import java.util.HashMap;

public class fruitsInbasket904 {
    public static int totalfruit(int [] fruits){
        HashMap<Integer,Integer> map = new HashMap<>();

        int maxlen = 0;
        int left = 0;
        int right = 0;
       for(right = 0; right<fruits.length ; right++){
           int currentCount = map.getOrDefault(fruits[right],0);
           map.put(fruits[right],currentCount+1);
           while(map.size()>2){
               int fruitcount = map.get(fruits[left]);
               if(fruitcount==1){
                   map.remove(fruits[left]);
                   left++;
               }else{
                   map.put(fruits[left],fruitcount-1);
                   left++;
               }
           }
           maxlen = Math.max(maxlen,right-left+1);
       }
       return maxlen;

    }
    public static void main(String[] args) {
        int [] fruits = {1,2,3,2,2};
        System.out.println(totalfruit(fruits));
    }
}
