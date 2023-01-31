import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class Q150_EvaluateReversePolishNotation {
    public static void main(String[] args) {
        String[] s1 = {"2","1","+","3","*"};
        System.out.println(evalRPN(s1));
    }

    private static int evalRPN(String[] s1) {
        Stack<Integer> stack = new Stack<>();
        for (String s : s1) {
            switch (s) {
                case "+" -> stack.add(stack.pop() + stack.pop());
                case "-" -> {
                    int temp1 = stack.pop();
                    int temp2 = stack.pop();
                    stack.add(temp1 - temp2);
                }
                case "*" -> stack.add(stack.pop() * stack.pop());
                case "/" -> {
                    int temp1 = stack.pop();
                    int temp2 = stack.pop();
                    stack.add(temp1 / temp2);
                }
                default -> stack.add(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
}
