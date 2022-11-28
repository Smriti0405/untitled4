package Super_150;

public class Permutation_Rec_NoDuplicates {
    public static void main(String[] args) {
        String s="ABCA";
        permutation(s,"");
    }
    public static void permutation(String s, String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            int flag = 0;
            for(int j=i+1; j<s.length(); j++){
                if(s.charAt(j) == ch){
                    flag = 1;
                    break;
                }
            }
            if(flag==0) {
                String s1 = s.substring(0, i);
                String s2 = s.substring(i + 1);
                permutation(s1 + s2, ans + ch);
            }
        }
    }
}
