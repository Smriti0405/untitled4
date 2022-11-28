package Super_150;

import java.util.Scanner;

public class String_substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        for(int i=1; i<=s.length() ; i++) {
            for (int j = i; j <= s.length(); j++) {
                System.out.println(s.substring(j - i, j));
            }
        }
    }
}
