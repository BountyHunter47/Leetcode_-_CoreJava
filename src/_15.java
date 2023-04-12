public class _15 {
    public static void main(String[] args) {
        System.out.println(removeDuplicate("abcd123abcefg"));
    }

    private static String removeDuplicate(String s) {
        int[] freq = new int[128];

        for (char ch : s.toCharArray()) freq[ch]++;

        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] == 1) ans += s.charAt(i);
        }

        return ans;
    }

}
