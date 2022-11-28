package Super_150;

public class Letter_Tile {
    public static void main(String[] args) {
        String s = "ABAC";
        int []freq = new int[26];
        for(int i=0; i<s.length(); i++){
            int idx = s.charAt(i)-'A';
            freq[idx]++;
        }
        System.out.println(possible(freq,""));
    }
    public static int possible(int []freq, String ans){
        //System.out.println(ans);
        int count =0;
        for(int i=0; i< freq.length; i++){
            if(freq[i]>=1){
                char ch = (char)(i+'A');
                freq[i]--;
                count += possible(freq,ans+ch)+1;
                freq[i]++;
            }
        }
        return count;
    }
}
