public class Q1422 {
    public static void main(String[] args) {
        System.out.println(maxScore("00"));
    }

    private static int maxScore(String s) {
        int one = 0, zero = 0;
        int ans = 0;
        for (char ch : s.toCharArray()) if (ch == '1') one++;
        int checker = 0;

        for (char ch : s.toCharArray()) {
            if (checker == s.length()-1) break;
            if (ch == '0') zero++;
            if (ch == '1') one--;
            ans = Math.max(ans, one+zero);
            checker++;
        }

        return ans;
    }
}
