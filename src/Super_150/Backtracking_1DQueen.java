package Super_150;
// find the number of arrangements of queens in the box
//arrangement - permutation
//arrangement not necessary only selection - combination

import java.util.Scanner;

public class Backtracking_1DQueen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        int q = 2;
        boolean []board = new boolean[n];
        answer(board,q,0,"");
    }
    public static void answer(boolean []board, int q, int qpsf, String ans){
        if(q==0){
            System.out.println(ans);
            return;
        }
        for(int i=0; i< board.length; i++){
            if(board[i]==false){
                board[i] = true;
                answer(board,q-1,qpsf+1,ans+"b"+i+"q"+qpsf);
                board[i] = false;//recursion does not undo the element we have to do this, this is called backtracking
            }
        }
    }
}
