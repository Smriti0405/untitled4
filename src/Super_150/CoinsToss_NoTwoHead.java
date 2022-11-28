package Super_150;

public class CoinsToss_NoTwoHead {
    public static void main(String[] args) {
        no_TwoHead(3,"");
    }
    public static void no_TwoHead(int n, String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }

        if(ans.length()==0 || ans.charAt(ans.length()-1)!='H'){
            no_TwoHead(n-1,ans+"H");
        }
        no_TwoHead(n-1,ans+"T");
    }
}

