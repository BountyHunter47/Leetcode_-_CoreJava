import java.util.Arrays;

public class Q1433 {
    public static void main(String[] args) {
        System.out.println(checkIfCanBreak("abc", "xya"));
    }
    public static boolean checkIfCanBreak(String s1, String s2) {

        char[] char1 = s1.toCharArray();
        char[] char2 = s2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);

        boolean flag1 = true, flag2 = true;
        for (int i = 0; i < s1.length(); i++) {
            if (char1[i] < char2[i]) flag1 = false;
        }
        if (flag1) return true;

        for (int i = 0; i < s1.length(); i++) {
            if (char1[i] > char2[i]) flag2 = false;
        }
        if (flag2) return true;

        return false;
    }
}
