package arrays.slidingwindow;
//efficient approach

public class numberOFsubStringContainingAllthreeCHaracters2 {
    public static int longestSubstring( String str ){
        int  [] lastseen = {-1,-1,-1};
        int count = 0;
        for(int i = 0 ; i<str.length();i++){
            lastseen[str.charAt(i)-'a']=i;
            if(lastseen[0]!=-1 && lastseen[1]!=-1 && lastseen[2]!=-1   ){
                count = count + Math.min(lastseen[0],Math.min(lastseen[1],lastseen[2]))+1;

        }
        }
        return count;

    }
    public static void main(String[] args) {
        String str = "abcabc";
        System.out.println(longestSubstring(str));
    }
}
