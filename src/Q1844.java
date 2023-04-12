public class Q1844 {
    public static void main(String[] args) {
        System.out.println(replaceDigits("a1c1e1"));
    }

    private static String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder(s);

        for (int i = 1; i < s.length(); i+=2) {
            sb.setCharAt(i, (char) (sb.charAt(i-1) + sb.charAt(i) - '0'));
        }
        return sb.toString();
    }
}
