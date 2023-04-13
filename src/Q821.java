import java.util.Arrays;

public class Q821 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(shortestToChar("aaba", 'b')));
    }

    private static int[] shortestToChar(String s, char c) {
        var size = 0;
        for (char ch : s.toCharArray()) if (ch == c) size++;

        int[] occur = new int[size];
        int idx = 0;
        for (int i = 0; i < s.length(); i++) if (s.charAt(i) == c) occur[idx++] = i;

        System.out.println(Arrays.toString(occur));

        int[] ans = new int[s.length()];
        idx = 0;
        for (int i = 0; i < ans.length; i++) {
            if (s.charAt(i) == c) {
                idx++;
                ans[i] = 0;
                continue;
            }
            if (idx == 0) {
                ans[i] = Math.abs(occur[idx] - i);
            }
            else if (idx >= occur.length) ans[i] = Math.abs(occur[idx-1] - i);
            else {
                ans[i] = Math.min(Math.abs(occur[idx] - i), Math.abs(occur[idx-1] - i));
            }
        }
        return ans;
    }
}
