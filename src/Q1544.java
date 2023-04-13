public class Q1544 {
    public static void main(String[] args) {
        System.out.println(makeGood("abBAcC"));
    }

    private static String makeGood(String s) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (sb.length() != 0  && Math.abs(sb.charAt(sb.length()-1) - s.charAt(i)) == 32) sb.deleteCharAt(sb.length()-1);
            else sb.append(s.charAt(i));
        }

        return sb.toString();
    }
}
