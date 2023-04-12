import java.sql.SQLOutput;

public class _6 {
    public static void main(String[] args) {
        System.out.println(updateChar("akshilaaaa", 'a', 'z'));
    }

    private static String updateChar(String s, char oldChar, char newChar) {
        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == oldChar) ans += newChar;
            else ans += s.charAt(i);
        }

        return ans;
    }
}
