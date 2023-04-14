import java.util.Arrays;

public class Q1143 {
    public static void main(String[] args) {
        int[][] dp = new int[6][4];
        for (int[] i : dp) Arrays.fill(i, -1);
        for (int i = 0; i < dp.length; i++) dp[i][0] = 0;
        Arrays.fill(dp[0], 0);

        System.out.println(lcs(5, 3, "abcde", "ace", dp));
    }

    private static int lcs(int m, int n, String a, String b, int[][] dp) {
        if (m == 0 || n == 0) return 0;
        if (dp[m][n] != -1) return dp[m][n];
        if (a.charAt(m-1) == b.charAt(n-1)) return dp[m][n] = 1 + lcs(m-1, n-1, a, b, dp);
        else return dp[m][n] = Math.max(lcs(m-1, n, a, b, dp), lcs(m, n-1, a, b, dp));

    }
}
