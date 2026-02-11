package arrays;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class leetcode2215 {
    public static List<List<Integer>> difference(int [] nums1 , int []nums2){
       HashSet<Integer>set1 = new HashSet<>();
       HashSet<Integer>set2 = new HashSet<>();
       for(int n : nums1){
           set1.add(n);
       }
       for(int n : nums2){
           set2.add(n);
       }
       List<Integer>list1 = new ArrayList<>();
       List<Integer>list2 = new ArrayList<>();
       for(int j : set1){
           if(!set2.contains(j)){
               list1.add(j);
           }
       }
       for(int j : set2){
           if(!set1.contains(j)){
               list2.add(j);
           }
       }
       List<List<Integer>>ans = new ArrayList<>();
       ans.add(list1);
       ans.add(list2);
       return ans;
    }
    public static void main(String[] args) {
        int [] nums1 = {1,2,3};
        int []nums2 = {2,4,6};
        System.out.println(difference(nums1,nums2));
    }
}
