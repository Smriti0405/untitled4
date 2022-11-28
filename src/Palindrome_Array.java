import java.util.Scanner;

public class Palindrome_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(palindrome(arr));
    }
    public static int palindrome(int []arr){
        int count=0;
        int i=0, j=arr.length-1;
        while(i<j){
            if(arr[i]>arr[j]){
                arr[j-1] += arr[j];
                j--;
                count++;
            }
            else if(arr[i]<arr[j]){
                arr[i+1] +=arr[i];
                i++;
                count++;
            }
            else{
                i++;
                j--;

            }
        }
        return count;
    }
}
