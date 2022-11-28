package Super_150;

public class Fact_Tail {
    static int k=1;
    public static void main(String[] args) {
        int ans = fact(5,1);
        System.out.println(ans);
    }
    public static int fact(int n, int ans){

        if(n==0){
//            return 1;
            return ans;
        }
//        k *=n;
//        fact(n-1);
//        return k;
        return fact(n-1, ans*n);
    }
}
