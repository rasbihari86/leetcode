package arrays;

class rotateArrayToRight {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        int [] temp = new int [n];
        k = k % n;

        for(int i = 0; i<n-k;i++){
            temp[k+i]=nums[i];

        }
        for(int i = 0;i<k;i++){
            temp[i]=nums[n-k+i];
        }
        for(int i = 0; i<n;i++){
            if(i==0){
                System.out.print("["+ temp[i]+ ",");
            } else if (i==temp.length-1) {
                System.out.print(temp[i]+ "]");

            }else {
                System.out.print(temp[i]+ ",");
            }
        }



    }

    public static void main(String[] args) {
        int []nums={1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums,k);
    }
}
