package Super_150;
// No backtracking in this question only recursion

public class Backtracking_coinSum10 {
    public static void main(String[] args) {
        int []coins = {2, 3, 5, 7};
        int sum =10;
        coinSum(coins,sum,"");
    }
    public static void coinSum(int []coins, int sum, String s){
        if(sum==0){
            System.out.println(s);
            return;
        }
        for(int j=0; j< coins.length; j++){
            if(coins[j]<=sum) {
                coinSum(coins, sum-coins[j],s + " " + coins[j]);
            }
        }
    }
}
