package Super_150;

public class Coin_Subsequence_Recursion {
    public static void main(String[] args) {
        coins(3,"");
    }
    public static void coins(int n, String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }

        coins(n-1,ans+"H");
        coins(n-1,ans+"T");
    }
}
