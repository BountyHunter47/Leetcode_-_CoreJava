public class _12 {
    public static void main(String[] args) {
        System.out.println(mergeString("abcd", "xyz"));
    }

    private static String mergeString(String s1, String s2) {
        String ans = "";

        int i = 0;
        while (i < s1.length() && i < s2.length()) {
            ans += s1.charAt(i);
            ans += s2.charAt(i++);
        }
        while (i < s1.length()) ans += s1.charAt(i++);
        while (i < s2.length()) ans += s2.charAt(i++);
        return ans;
    }
}
