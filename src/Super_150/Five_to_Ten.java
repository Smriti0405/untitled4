package Super_150;

public class Five_to_Ten {
    public static void main(String[] args) {
        int n = 342;
        int sum=0;
        int mul=1;
        while(n>0){
            int rem = n%10;
            sum += rem*mul;
            mul *=5;
            n/=10;
        }
        System.out.println(sum);
    }
}
