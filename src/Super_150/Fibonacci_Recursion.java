package Super_150;

import java.util.Scanner;

public class Fibonacci_Recursion {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        System.out.println(fibo(5));
    }
    public static int fibo(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int a = fibo(n-1);
        int b = fibo(n-2);
        return a+b;
    }
}
