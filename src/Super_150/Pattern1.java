package Super_150;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star =n;

        while(n>=0){
            int i=1;
            while(i<=star){
                System.out.print("*"+" ");
                i++;
            }
            n--;
            System.out.println();
        }
    }
}
