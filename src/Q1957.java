import java.util.Objects;

public class Q1957 {
    public static void main(String[] args) {
        System.out.println(makeFancyString("leeetcode"));
    }

    private static String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder(s);

        for (int i = 2; i < sb.length(); i++) {
            if (sb.charAt(i) == sb.charAt(i-1) && sb.charAt(i-1) == sb.charAt(i-2)) {
                sb.deleteCharAt(i);
                i--;
            }
        }

        return sb.toString();
    }
}
