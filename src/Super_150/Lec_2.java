package Super_150;

import java.util.Scanner;

public class Lec_2 {
    public static void main(String[] args) {
        //GCD
        Scanner sc = new Scanner(System.in);

        int divid = sc.nextInt();
        int divis = sc.nextInt();

        while(divid%divis!=0){
            int rem = divid%divis;
            divid = divis;
            divis = rem;
        }
        System.out.println(divis);
    }
}
