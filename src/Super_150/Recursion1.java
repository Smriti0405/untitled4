package Super_150;

public class Recursion1 {
    public static void main(String[] args) {
        fact(5);
    }
    public static void fact(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        fact(n-1);
        System.out.println(n);
    }
}
