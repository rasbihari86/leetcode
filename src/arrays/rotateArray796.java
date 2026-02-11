package arrays;
//check if string

public class rotateArray796 {
    //NORMAL APPROACH
    public static boolean isRotation(String str,String str2){
        int n = str.length();
        if(str.length()!=str2.length()){
            return false;
        }
        for(int i = 0 ; i<n;i++){
            if(str.equals(str2)){
                return true;
            }else{
                char last = str.charAt(n-1);
                str = last+str.substring(0,n-1);




            }

        }
        return false;
    }
    //THIS IS A OPTIMAL APPROACH;
    public static boolean isRotation2(String s , String goal){
        if(s.length()!=goal.length()){
            return false;
        }
        s = s+s;
        if(s.contains(goal)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "hello";
        String str2 = "llohe";
        System.out.println(isRotation(str,str2));
        System.out.println(isRotation2(str,str2));
    }
}
