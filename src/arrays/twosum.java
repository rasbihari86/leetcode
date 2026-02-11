package arrays;

public class twosum {
    public static int[] indices(int [] arr, int target) {
        int size = 2;
        int indices1 = 0;
        int indices2 = 0;
        int[] indarray = new int[size];
        for (int i = 0; i < arr.length; i++) {
            for (int j =  i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    indices1 = arr[i];
                    indices2 = arr[j];
                    indarray[0] = i;
                    indarray[1] = j;

                }
            }

        }
        return indarray;
    }
    public static void main(String[] args) {
        int [] arr = {2,7,11,15};
        int target = 17;
        int []res =indices(arr,target);
        for (int n : res){
            System.out.print(n + " ");
        }

    }
}
