package Super_150;

public class Merge_2_Array {
    public static void main(String[] args) {
        int []arr1 = {1,3,5,8};
        int []arr2 = {2,4,6};

        mergeArray(arr1,arr2);
    }
    public static void mergeArray(int []arr1, int []arr2) {
        int i = 0, j = 0, k = 0;
        int[] ans = new int[arr1.length + arr2.length];

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                ans[k] = arr1[i];
                i++;
            } else {
                ans[k] = arr2[j];
                j++;
            }
            k++;
        }
        while(i< arr1.length){
            ans[k] = arr1[i];
            i++;
            k++;
        }
        while(j< arr2.length){
            ans[k] = arr2[j];
            i++;
            k++;
        }

        for (int l = 0; l < ans.length; l++){
            System.out.print(ans[l]+" ");
        }
    }
}
