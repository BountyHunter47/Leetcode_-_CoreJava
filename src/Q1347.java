public class Q1347 {
    public static void main(String[] args) {
        System.out.println(minSteps("bab", "aba"));
    }

    private static int minSteps(String s, String t) {
        int[] freq = new int[26];

        for (char ch : s.toCharArray()) freq[ch - 'a']++;

        int ans = 0;
        for (char ch : t.toCharArray()) freq[ch - 'a']--;
        for (int i: freq) if (i > 0) ans += i;

        return ans;
    }
}
