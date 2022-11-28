import java.util.Arrays;

public class abc {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (nums1[i] > nums2[j]) {
                int temp = nums1[i];
                nums1[i] = nums2[j];
                nums2[j] = temp;
                Arrays.sort(nums2);
                j++;
                i++;
            } else {
                i++;
            }
        }
        if(i==m){
            for(int k=i; k<i; i++){
                nums1[k]=nums2[j];
            }
        }

        for (int k = 0; k < m; k++)
            System.out.println(nums1[k]);
    }

    public static void main(String[] args) {
        int []nums1 = {1,2,3,0,0,0};
        int []nums2 = {2,4,5};
        merge(nums1,3, nums2, 3);
    }
}
