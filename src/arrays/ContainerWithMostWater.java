package arrays;

public class ContainerWithMostWater {
    public static int result(int [] height) {
        int maxWater  = 0;
        int leftPointer = 0;
        int rightPointer = height.length-1;
        while (leftPointer<rightPointer){
            int currentWater = 0;
            int width = rightPointer-leftPointer;
            currentWater = width*Math.min(height[rightPointer],height[leftPointer]);
            maxWater = currentWater>maxWater?currentWater:maxWater;
            if(height[leftPointer]<=height[rightPointer]){
                leftPointer++;
            }else{
                rightPointer--;

            }

        }
        return maxWater;

    }
    public static void main(String[] args) {
        int [] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(result(height));
    }

}
