package Super_150;

import java.util.Scanner;

public class Lec_1 {
    // if else
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n>=75)
            System.out.println("A");
        else if(n<75 && n>=65)
            System.out.println("B");
        else if(n<65 && n>=55)
            System.out.println("C");
        else if(n<55 && n>=45)
            System.out.println("D");
        else
            System.out.println("Fail");
    }

}
