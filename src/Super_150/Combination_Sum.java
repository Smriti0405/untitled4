package Super_150;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Combination_Sum {
    public static void main(String[] args) {
        int []arr = {10,1,2,7,6,1,5};
        int target = 8;
        Arrays.sort(arr);
        comb_Sum(arr,target,0," ");
    }
    public static void comb_Sum(int []arr, int sum, int i, String ans){
        if(sum==0){
            System.out.println(ans);
            return;
        }
        for(int j=i; j< arr.length; j++) {
            if(j!=i && arr[j]==arr[j-1]){
                continue;
            }
            if(sum>=arr[j])
            comb_Sum(arr, sum - arr[j], j + 1, ans + arr[j] + " ");
        }
    }
}
