package Super_150;

import java.util.Scanner;

public class Binary_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        int m = sc.nextInt();
        binary_search(0,n-1, arr, m);
        }
        public static int binary_search(int start, int end, int[]arr, int item){
          int mid = (start+end)/2;
          if(arr[mid]==item){
              return mid;
          }
          else if(arr[mid]>item){
              end = mid-1;
            }
          else{
              start = mid+1;
          }
          return -1;
        }
}

