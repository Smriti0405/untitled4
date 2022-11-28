package Super_150;

import java.util.Scanner;

public class Array_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        int num = sc.nextInt();
        int ind =0, flag =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 11) {
                ind =i;
                flag =1;
            }
        }
        if(flag==1){
            System.out.println(ind);
        }
        else{
            System.out.println("-1");
        }
    }
}
