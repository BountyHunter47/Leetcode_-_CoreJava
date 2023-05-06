public class Q1456 {
    public static void main(String[] args) {
        System.out.println(maxVowel("abciiidef", 3));
    }

    private static int maxVowel(String s, int k) {
        int ans = 0;
        int tmp = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i < k) {
                if (Utils.isVowel(s.charAt(i))) tmp++;
            }
            else {
                if (Utils.isVowel(s.charAt(i-k))) tmp--;
                if (Utils.isVowel(s.charAt(i))) tmp++;
            }
            ans = Math.max(ans, tmp);
        }
        return ans;
    }
}
