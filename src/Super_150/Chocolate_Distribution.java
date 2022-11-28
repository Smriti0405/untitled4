package Super_150;

import java.util.Arrays;
import java.util.Scanner;

public class Chocolate_Distribution {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] choco = new int[n];

       for(int i=0; i<n; i++){
       choco[i] = sc.nextInt();
       }
       int m = sc.nextInt();
       System.out.println(minimum_choco(choco, m));
    }
    public static int minimum_choco(int[]arr, int m){
        Arrays.sort(arr);
        int diff=Integer.MAX_VALUE;
        for(int i=0; i< arr.length-m+1; i++){
            diff = Math.min(diff, arr[m+i-1]-arr[i]);
        }
        return diff;
    }
}
