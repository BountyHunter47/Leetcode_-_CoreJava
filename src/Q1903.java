public class Q1903 {
    public static void main(String[] args) {
        System.out.println(largestOddNumber("52"));
    }

    private static String largestOddNumber(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = s.length()-1; i >= 0; i--) {
            if (((s.charAt(i)-'0') % 2) != 0 || !sb.isEmpty()) sb.append(s.charAt(i));
        }

        return sb.reverse().toString();
    }
}
