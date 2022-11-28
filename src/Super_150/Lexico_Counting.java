package Super_150;

public class Lexico_Counting {
    public static void main(String[] args) {
        LexicoCount(0,1000);
    }
    public static void LexicoCount(int curr, int n){
        if(curr>n){
            return;
        }
        System.out.println(curr);
        int i=0;
        if(curr==0){
            i=1;
        }
        for(; i<=9; i++){
            LexicoCount(curr*10+i,n);
        }
    }
}
