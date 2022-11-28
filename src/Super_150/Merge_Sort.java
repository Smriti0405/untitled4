package Super_150;

public class Merge_Sort {
    public static void main(String[] args) {
        int []arr = {2,3,1,4,5,8,-11};
        int []res = sort(arr,0, arr.length-1);
        for(int i=0; i< res.length; i++){
            System.out.print(res[i]+" ");
        }
    }
    public static int[] sort(int []arr, int s, int e){
        if(s==e) {
            int[] bs = new int[1];
            bs[0] = arr[s];
            return bs;
        }
        int mid = (s+e)/2;
        int []fa = sort(arr,s,mid);
        int []sa = sort(arr,mid+1,e);
        return mergeArray(fa,sa);
    }
    public static int[] mergeArray(int []arr1, int[] arr2){
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

        return ans;
    }
}
