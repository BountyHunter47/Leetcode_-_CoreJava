public class Q1974 {
    public static void main(String[] args) {
        System.out.println(minTimeToType("abc"));
    }
    public static int minTimeToType(String word) {
        int ans = word.length();
        char start = 'a';
        for (char ch : word.toCharArray()) {
            int diff = Math.abs(ch - start);
            ans += Math.min(diff, 26 - diff);
            start = ch;
        }
        return ans;
    }
}
