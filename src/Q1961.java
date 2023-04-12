public class Q1961 {
    public static void main(String[] args) {
        System.out.println(isPrefixString("iloveleetcode", new String[]{"i","love","leetcode","apples"}));
    }
    public static boolean isPrefixString(String s, String[] words) {
        StringBuilder sb = new StringBuilder();
        for (String str : words) {
            if (sb.length() >= s.length()) break;
            sb.append(str);
        }

        return sb.toString().equals(s);
    }
}
