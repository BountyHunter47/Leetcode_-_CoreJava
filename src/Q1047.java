import java.util.Stack;

public class Q1047 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));
    }
    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(s.charAt(i));
                sb.append(s.charAt(i));
            }else {
                if (s.charAt(i) == stack.peek()){
                    stack.pop();
                    sb.deleteCharAt(sb.length()-1);
                }
                else {
                    sb.append(s.charAt(i));
                    stack.push(s.charAt(i));
                }
            }
        }

        return sb.toString();
    }
}
