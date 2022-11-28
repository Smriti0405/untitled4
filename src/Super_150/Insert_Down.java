package Super_150;

import java.util.Stack;

public class Insert_Down {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack);
        Insert(stack,-10);
        System.out.println(stack);
    }
    public static void Insert(Stack<Integer> stack, int n){

        if(stack.isEmpty()){
            stack.push(n);
            return;
        }

        int a =  stack.pop();
        Insert(stack,n);
        stack.push(a);

    }
}
