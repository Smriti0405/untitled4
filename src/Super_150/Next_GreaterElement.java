package Super_150;

import java.util.Stack;

public class Next_GreaterElement {
    public static void main(String[] args) {
        int []arr = {10,2,1,35,4,8,7};
        NGE(arr);
    }
    public static void NGE(int []arr){
        int []ans = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i=0; i< arr.length; i++) {
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                ans[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
            while (!stack.isEmpty()){
                ans[stack.pop()] = -1;
            }
            for (int i=0; i<ans.length; i++){
                System.out.println(arr[i]+"  "+ans[i]);
            }
    }
}

//sunny, daily temp, stock span