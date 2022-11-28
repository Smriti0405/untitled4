package Super_150;

public class Recursion2 {
    public static void main(String[] args) {
        int []arr = {2,3,5,4,1,3,7,3,6};
        int n = 3;
        System.out.println(index(arr, n, arr.length-1));
    }
    public static int index(int []arr, int n, int i){
        if(i<0)
            return -1;
        if(arr[i]==n){
            return i;
        }
        return index(arr, n, i-1);
    }
}
