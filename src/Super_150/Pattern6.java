package Super_150;

import java.util.Scanner;

public class Pattern6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row =1;
        int star =1;
        while(row <= 2*n-1){
            int i=1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            //Mirroring
            if(row<n)
                star++;
            else
                star--;

            row++;
            System.out.println();

        }
    }
}
