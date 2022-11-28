package Super_150;

public class Maze_Path {
    public static void main(String[] args) {
        int m =3;
        int n =3;
        getPath(m-1,n-1,0,0,"");
    }
    public static void getPath(int er, int ec, int cr, int cc, String ans){
        if(cr==er && cc==ec){
            System.out.println(ans);
            return;
        }
        if(cr>er || cc>ec){
            return;
        }

        getPath(er,ec,cr,cc+1,ans+"H");
        getPath(er,ec,cr+1,cc,ans+"V");

    }
}
