package Strings;

import java.util.ArrayList;

public class isoMorphic {
    public static boolean Isisomorphic(String s1,String s2){
        if (s1.length() != s2.length()) {
            return false;
        }
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        int i = 0;
        while (i < s1.length()) {
            char ch = s1.charAt(i);
            char ch2 = s2.charAt(i);
            if (list1.contains(ch) && list2.contains(ch2)) {
                i++;

            } else if (list1.contains(ch) && !list2.contains(ch2)) {
                return false;

            } else if (!list1.contains(ch) && list2.contains(ch2)) {
                return false;

            } else {
                list1.add(ch + "");
                list2.add(ch2 + "");
                i++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "foo";
        String s2 = "bar";
        System.out.println(Isisomorphic(s1,s2));
    }
}
