package Super_150;

public class String_compare {
    public static void main(String[] args) {
        String s1="Kartik";
        String s2 ="Karan";
        int flag=0;
        if(s1.length()==s2.length()){
            for(int i=0; i<s1.length(); i++){
                if(s1.charAt(i)==s2.charAt(i)){
                    flag=1;
                }
                else{
                    flag=0;
                    break;
                }
            }
        }
        else if(s1.length()>s2.length()){
            System.out.println("1");
        }
        else{
            System.out.println("-1");
        }
        if(flag==1){
            System.out.println("0");
        }
    }
}
