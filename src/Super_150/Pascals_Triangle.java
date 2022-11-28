package Super_150;

import java.util.Scanner;
// We do not directly use the nCr formula because then we will have to use recurrsion continuosly which will take more time
public class Pascals_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 0;
        int star = 1;
        while(row<n){
            int i=0;
            int val=1;
            while(i<star){
                System.out.print(val+" ");
                // Using formula nCr+1/nCr => ((nCr)*(n-r))/(r+1)
                val = (val*(row-1))/(i+1);
                i++;
            }
            row++;
            star++;
            System.out.println();
        }
    }
}
