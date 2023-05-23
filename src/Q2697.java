public class Q2697 {
    public static void main(String[] args) {
        System.out.println(smallestLexicographicalPalindrome("egcfe"));
    }

    private static String smallestLexicographicalPalindrome(String s) {
        int start =0, end =s.length()-1;
        StringBuilder sb = new StringBuilder(s);
        while (start < end) {
            char startChar = sb.charAt(start), endChar = sb.charAt(end);
            if (startChar != endChar) {
                if (endChar > startChar) {
                    sb.setCharAt(end, startChar);
                }
                else {
                    sb.setCharAt(start, endChar);
                }
            }
            start++;
            end--;
        }
        return String.valueOf(sb);
    }
}
