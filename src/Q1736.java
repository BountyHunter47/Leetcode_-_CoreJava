public class Q1736 {
    public static void main(String[] args) {
        System.out.println(maximumTime("0?:3?"));
    }

    private static String maximumTime(String s) {
        StringBuilder sb = new StringBuilder(s);
        if (s.charAt(0) == '?' && s.charAt(1) == '?' && s.charAt(3) == '?' && s.charAt(4) == '?') return "23:59";

        if (sb.charAt(0) == '?' && sb.charAt(1) == '?') {
            sb.setCharAt(0,'2');
            sb.setCharAt(1,'3');
        }else {
            if (s.charAt(0) == '?') {
                if (sb.charAt(1) <= '3') sb.setCharAt(0, '2');
                else sb.setCharAt(0, '1');
            }
            if (s.charAt(1) == '?') {
                if (sb.charAt(0) == '2') sb.setCharAt(1, '3');
                else sb.setCharAt(1, '9');
            }
        }
        if (sb.charAt(3) == '?' ) sb.setCharAt(3, '5');
        if (sb.charAt(4) == '?' ) sb.setCharAt(4, '9');


        return sb.toString();
    }
}
