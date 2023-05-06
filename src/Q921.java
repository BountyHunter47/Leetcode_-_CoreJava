public class Q921 {
    public static void main(String[] args) {
        System.out.println(minAddToMakeValid("())"));
    }

    private static int minAddToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch == '(') sb.append('(');
            else if (ch == ')' && sb.isEmpty()) sb.append(ch);
            else if (ch == ')' && sb.charAt(sb.length()-1) == '(') sb.setLength(sb.length()-1);
            else sb.append(ch);
        }
        return sb.length();
    }
}
