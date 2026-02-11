package arrays;

public class twoSumUsing2Pointer {
    //TWO PONTER APPROACH IS USED IN SORTED ARRAY

    public static int[] targetvalue(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int[] newarr = new int[2];
        while (left < right) {
            if (arr[left] + arr[right] == target) {
                newarr[0] = arr[left];
                newarr[1] = arr[right];
                break;
            } else if (target < (arr[left]+arr[right])) {
                right--;

            } else {
                left++;
            }

        }
        return newarr;
    }


    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6};
        int target = 9;
        int []result = targetvalue(arr,9);
        for(int n : result){
            System.out.print(n+ " ");
        }
    }
}
