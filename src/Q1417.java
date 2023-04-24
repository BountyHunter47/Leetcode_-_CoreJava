import java.util.HashSet;
import java.util.Set;

public class Q1417 {
    public static void main(String[] args) {
        System.out.println(reformat("ab123"));
    }

    private static String reformat(String s) {
        int countDigit = 0;
        int countLetters = 0;
        for (char ch : s.toCharArray()) {
            if (ch >= '0' && ch <= '9') countDigit++;
            else countLetters++;
        }

        if (Math.abs(countDigit - countLetters) != 0 && Math.abs(countDigit - countLetters) !=1) return "";
        String ans = "";
        int i = 0;
        int l = 0, d = 0;

        if (countLetters > countDigit) {
            while (l < s.length() || d < s.length()) {
                while (l < s.length() && s.charAt(l) >= '0' && s.charAt(l) <= '9')l++;
                if (l < s.length() && (s.charAt(l) < '0' || s.charAt(l) > '9')) ans += s.charAt(l++);

                while (d < s.length() && (s.charAt(d) < '0' || s.charAt(d) > '9'))d++;
                if (d < s.length() && s.charAt(d) >= '0' && s.charAt(d) <= '9') ans += s.charAt(d++);
            }
        }
        else {
            while (l < s.length() || d < s.length()) {
                while (d < s.length() && (s.charAt(d) < '0' || s.charAt(d) > '9'))d++;
                if (d < s.length() && s.charAt(d) >= '0' && s.charAt(d) <= '9') ans += s.charAt(d++);

                while (l < s.length() && s.charAt(l) >= '0' && s.charAt(l) <= '9')l++;
                if (l < s.length() && (s.charAt(l) < '0' || s.charAt(l) > '9')) ans += s.charAt(l++);
            }
        }

        return ans;
    }
}
