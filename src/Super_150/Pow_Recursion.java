package Super_150;

public class Pow_Recursion {
    public static void main(String[] args) {
        System.out.println(power(4,3,1));
    }
    public static int power(int a, int b, int ans){
        if(b==0){
            return ans;
        }
        return power(a,b-1, ans*a);

    }
}
