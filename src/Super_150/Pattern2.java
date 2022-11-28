package Super_150;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int j=0;
        while(j<n){
            int i=0;
            while(i<=j){
                System.out.print("*"+" ");
                i++;
            }
            j++;
            System.out.println();
        }
    }
}
