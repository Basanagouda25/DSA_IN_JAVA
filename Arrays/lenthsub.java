import java.util.HashSet;

public class lenthsub {
    static int length(String s){
        int n = s.length();
        int maxlen = 0;
        int l  = 0;
        HashSet<Character> charset = new HashSet<>();
        for(int r = 0; r<n; r++){
            while (charset.contains(r)) {
                charset.remove(s.charAt(r));
                l++;
            }
        charset.add(s.charAt(r));
        maxlen = Math.max(maxlen, r-l+1);
        }
        return maxlen;
    }
    public static void main(String[] args) {
        String s = "abcddabc";
        int length = length(s);
        System.out.println(length);
    }
}
