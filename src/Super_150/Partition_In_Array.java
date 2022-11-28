package Super_150;

public class Partition_In_Array {
    public static void main(String[] args) {
        int [] arr = {5,7,2,3,8,9,1,4};
        int ans = partition(arr,0,arr.length-1);
        System.out.println(ans);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static int partition(int []arr, int s, int e){
        int item = arr[e];
        int pi = s;
        for(int i=s; i<e; i++){
            if(arr[i]<item){
                int temp = arr[i];
                arr[i] = arr[pi];
                arr[pi] = temp;
                pi++;
            }
        }
        int temp = arr[e];
        arr[e] = arr[pi];
        arr[pi] = temp;

        return pi;
    }
}
