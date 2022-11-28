package Super_150;

import java.util.Scanner;

public class Spiral_clockwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m =sc.nextInt();
        int n = sc.nextInt();
        int [][] arr = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=i; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

    }
    public static void print(int [][]arr, int m, int n){

    }
}
