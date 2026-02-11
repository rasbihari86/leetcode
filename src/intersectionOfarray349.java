//import java.util.Arrays;
//import java.util.HashSet;
//
//public class intersectionOfarray349 {
//    public static int [] intersection(int []nums1,int[]nums2){
//        HashSet<Integer>temp = new HashSet<>();
//        Arrays.sort(nums1);
//        Arrays.sort(nums2);
//
//        int i = 0;
//        int j = 0;
//        while(i<nums1.length&&j<nums2.length){
//            if(nums1[i]==nums2[j]){
//                temp[k]=nums1[i];
//                i++;
//                j++;
//                k++;
//
//            } else if(nums1[i]>nums2[j]) {
//                j++;
//
//            }
//            else{
//                i++;
//            }
//        }
//        int [] result = new int[k];
//        for (int l = 0; l<k ; l++){
//            result[l]=temp[l];
//        }
//        return result;
//
//
//
//    }
//    public static void main(String[] args) {
//        int []nums1={1,2,2,1};
//        int []nums2 = {2,2};
//        int [] result = intersection(nums1,nums2);
//        for(int n : result){
//            System.out.print(n);
//        }
//    }
//}
