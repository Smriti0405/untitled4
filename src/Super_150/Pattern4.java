package Super_150;

import java.util.Scanner;

public class Pattern4 {
    /*
      ****
        ****
          ****
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=0;
        int t=n;
        while(i<n){
            int j=0;
            while(j<t){
                System.out.print("* ");
                j++;
            }
            t--;
            System.out.println();
            for(int k=0; k<i+1; k++){
                System.out.print("    ");
            }
            i++;
        }
    }
}
