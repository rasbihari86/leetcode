package arrays;

public class leetcode605 {
    public static boolean canplant(int []flowerbed , int n ){
        if(n==0)return true;
        int k = flowerbed.length-1;
        for(int i = 0 ; i<=k ; i++){
            boolean left = (i==0||flowerbed[i-1]==0);
            boolean right = (i==k ||flowerbed[i+1]==0);
            if(flowerbed[i]==0){
                if(left&&right){
                    n--;
                    flowerbed[i]=1;
                }
            }
            if(n==0)return true;
        }
        return false;

    }
    public static void main(String[] args) {
        int [] arr = {1,0,0,0,1};
        int n = 2;
        System.out.println(canplant(arr,n));
    }
}
