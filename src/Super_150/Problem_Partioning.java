package Super_150;

import java.util.ArrayList;
import java.util.List;

public class Problem_Partioning {
    public static void main(String[] args) {
        String s = "nitin";
        List<String> list = new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();
        partition(s,list,ans);
        System.out.println(ans);
    }
    public static void partition(String s, List<String> list, List<List<String>> ans){
        if(s.length()==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=1; i<=s.length(); i++){
            String s1 = s.substring(0,i);
            if(palindrome(s1)) {
                list.add(s1);
                partition(s.substring(i), list, ans);
                list.remove(list.size()-1);
            }
        }
    }
    public static boolean palindrome(String s){
        int i=0, j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
