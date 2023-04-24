public class Q2379 {
    public static void main(String[] args) {
        System.out.println(minRecolor("WBWBWBWBW", 5));
    }

    private static int minRecolor(String s, int k) {
        int ans = 0, w = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'W') w++;

            if (i - k >= 0 && s.charAt(i-k) == 'W') ans++;
            ans = Math.min(ans, w);
        }

        return ans;
    }
}
