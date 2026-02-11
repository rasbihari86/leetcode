package arrays.slidingwindow;

public class maximumPointsYouCanObtainFromCards {
    public static  int maxScore(int [] points, int k ){
        int leftsum = 0;
        int rightsum = 0;
        int left = 0;
        int right = points.length-1;
        int maxsum = 0;
        for(left = 0 ; left<k ; left++){
            leftsum = leftsum+ points[left];

        }
        int leftindex = k-1;
        int rightindex = right;
        maxsum =leftsum;

        for(int i = 0 ; i<k ; i++){
            leftsum = leftsum-points[leftindex--];
            rightsum = rightsum +points[rightindex--];
            maxsum = Math.max(leftsum+rightsum,maxsum);


        }
        return maxsum;
    }
    public static void main(String[] args) {
        int arr []= {1,2,3,4,5,6,1};
        int  k = 3;
        System.out.println();
        System.out.println(maxScore(arr,k));
    }
}
