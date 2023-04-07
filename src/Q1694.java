public class Q1694 {
    public static void main(String[] args) {
        System.out.println(reformatNumber("123 4-5678"));
    }
    public static String reformatNumber(String number) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < number.length(); i++) if (number.charAt(i) != ' ' && number.charAt(i) != '-') sb.append(number.charAt(i));

        StringBuilder ans = new StringBuilder();
        int idx = 0;
//        123456
        while (idx < sb.length()) {
            if (sb.length() - idx == 2) {
                ans.append(sb.charAt(idx++));
                ans.append(sb.charAt(idx++));
            }
            if (sb.length() - idx == 4) {
                ans.append(sb.charAt(idx++));
                ans.append(sb.charAt(idx++));
                ans.append('-');
                ans.append(sb.charAt(idx++));
                ans.append(sb.charAt(idx++));
            }
            if (sb.length() - idx == 3) {
                ans.append(sb.charAt(idx++));
                ans.append(sb.charAt(idx++));
                ans.append(sb.charAt(idx++));
            }
            if (sb.length() - idx > 4) {
                ans.append(sb.charAt(idx++));
                ans.append(sb.charAt(idx++));
                ans.append(sb.charAt(idx++));
                ans.append('-');
            }
        }
        return ans.toString();
    }
}
