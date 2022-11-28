package Super_150;

import java.util.Scanner;

public class Array_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }

        reverse(arr);
    }

    public static void reverse(int []arr){
        for(int i=0; i<(arr.length-1)/2; i++){
            int temp = arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
