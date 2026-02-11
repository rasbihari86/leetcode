//package arrays;
//
//public class mergetwosortedArrays {
//    public static int[] solution(int[]nums1,int[]nums2){
//        int i = 0;
//        int j = 0;
//        int k = nums2.length;
//        while(j<k){
//            if(nums1[i]<nums2[j]){
//                i++;
//            } else if (nums1[i]==nums2[j]) {
//                nums1[i+1]
//                i++;
//                nums1[i]=nums2[j];
//                j++;
//                i++;
//
//            } else{
//                nums1[i]=nums2[j];
//                j++;
//                i++;
//            }
//        }
//        return nums1;
//    }
//    public static void main(String[] args) {
//        int [] nums1 = {1,2,3,0,0,0};
//        int nums2[]= {2,5,6};
//        int [] res =  solution(nums1,nums2);
//        for (int n : res){
//            System.out.print(n);
//        }
//    }
//}
