package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class intersectionOfTwoarrays360 {
    public static int[] intersection(int[]nums1,int[]nums2) {
        HashSet<Integer>set = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]==nums2[j]){
                set.add(nums1[i]);
                i++;
                j++;

            } else {
                if(nums1[i]<nums2[j]&&i< nums1.length){
                    i++;
                } else if (nums2[j]<nums1[i]&&j<nums2.length) {
                    j++;

                }

            }
        }
        int[]arr = new int[set.size()];
        int k= 0;
        for(int n : set){
            arr[k++]=n;
        }
        return arr;


    }
    //this approach is optmal
    public static int [] intersectionApproach2(int[]nums1,int []nums2){
        HashSet<Integer>set1 = new HashSet<>();
        HashSet<Integer>set2 = new HashSet<>();
        for(int n : nums1){
            set1.add(n);
        }
        for(int k : nums2){
            if(set1.contains(k)){
                set2.add(k);
            }

        }
        int [] arr2 = new int[set2.size()];
        int i = 0;
        for(int j : set2){
            arr2[i++]=j;

        }
        return arr2;
    }
    public static void main(String[] args) {
        int [] nums1 = {1,2};
        int [] nums2 = {2,3,2};
        int [] result = intersectionApproach2(nums1,nums2);
        for(int n : result){
            System.out.print(n);
        }


    }
}
