package Super_150;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int n =3;
        String src="A";
        String hlp="C";
        String dst="B";

        toh(n,src,hlp,dst);
    }
    public static void toh(int n, String src, String hlp, String dst){
        if(n==0)
            return;
        toh(n-1,src,dst,hlp);
        System.out.println("Move "+n+"th"+" disc from "+src+" to "+dst);
        toh(n-1,hlp,src,dst);
    }
}
