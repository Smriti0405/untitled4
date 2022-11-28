package Super_150;

import java.util.Scanner;

public class Min_Array {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int []arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(least(arr));
    }
    public static int least(int []arr){
        int min=Integer.MAX_VALUE;
        for(int i = 0; i< arr.length-1; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}
