import java.util.Arrays;

public class Q806 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(numberOfLines(new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10}, "abcdefghijklmnopqrstuvwxyz")));
    }
    public static int[] numberOfLines(int[] widths, String s) {
        int tmp = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (widths[s.charAt(i) - 'a'] + tmp <= 100) tmp += widths[s.charAt(i) - 'a'];
            else {
                count++;
                tmp = widths[s.charAt(i) - 'a'];
            }
        }

        return new int[]{++count, tmp};
    }
}
