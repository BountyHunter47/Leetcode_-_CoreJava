public class Q796 {
    public static void main(String[] args) {
        System.out.println(rotateString("abcde", "cdeab"));
    }


    public static boolean rotateString(String s, String goal) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            sb.append(sb.charAt(0));
            sb.deleteCharAt(0);

            if (sb.toString().equals(goal)) return true;
        }
        return false;
    }
}
