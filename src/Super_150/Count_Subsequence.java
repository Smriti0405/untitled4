package Super_150;

public class Count_Subsequence {
    public static void main(String[] args) {
        String s = "abc";
        String ans = "";
        System.out.println(countsubsequence(s,ans));
    }
    public static int countsubsequence(String s, String ans){
        if(s.length()==0){
            //System.out.println(ans);
            return 1;
        }
        char ch = s.charAt(0);
        int ans1 = countsubsequence(s.substring(1),ans);
        int ans2 = countsubsequence(s.substring(1),ans+ch);
        return ans1+ans2;
    }
}

