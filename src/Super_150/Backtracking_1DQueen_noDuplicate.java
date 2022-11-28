package Super_150;

import java.util.Scanner;

public class Backtracking_1DQueen_noDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        int q = 2;
        boolean []board = new boolean[n];
        answer(board,q,0,"",0);
    }
    public static void answer(boolean []board, int q, int qpsf, String ans, int j){
        if(q==0){
            System.out.println(ans);
            return;
        }
        for(int i=j; i< board.length; i++){
            if(board[i]==false){
                board[i] = true;
                answer(board,q-1,qpsf+1,ans+"b"+i+"q"+qpsf,i+1);
                board[i] = false;
            }
        }
    }
}
