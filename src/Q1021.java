import java.util.Stack;

public class Q1021 {
    public static void main(String[] args) {
        String s = "(())())(())(()(()))";
        removeOuterParentheses(s);
    }

    public static String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()){
            if (ch == '(' && stack.isEmpty()) stack.add(ch);
            else if (ch == '(' && stack.size() > 0) {
                sb.append("(");
                stack.push('(');
            }
            else if(ch == ')' && stack.size() > 1) {
                sb.append(")");
                stack.pop();
            } else if (ch == ')' && stack.size() == 1) {
                stack.pop();
            }
        }
        System.out.println(sb);
        return sb.toString();
    }
}
