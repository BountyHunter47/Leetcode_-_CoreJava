import java.util.Objects;

public class Q844 {
    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab#c","ad#c"));
    }
    public static boolean backspaceCompare(String s, String t) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int tmp1 = 0;
        int tmp2 = 0;

        for (int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i) == '#') {
                tmp1++;
                continue;
            }
            if (tmp1 > 0) {
                i -= tmp1;
                tmp1 = 0;
            }
            sb1.append(s.charAt(i));
        }
        for (int i = t.length()-1; i >= 0; i--) {
            if (t.charAt(i) == '#') {
                tmp2++;
                continue;
            }
            if (tmp2 > 0) {
                i -= tmp2;
                tmp2 = 0;
            }
            sb2.append(t.charAt(i));
        }

        System.out.println(sb1);
        System.out.println(sb2);
        return Objects.equals(String.valueOf(sb1), String.valueOf(sb2));
    }
}
