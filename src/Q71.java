import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Q71 {
    public static void main(String[] args) {
        System.out.println(simplifyPath("/../"));
    }

    public static String simplifyPath(String path) {
        String[] arr = path.split("/");

//        for (String string : arr) string = string.trim();

        System.out.println(Arrays.toString(arr));
        Stack<String> stack = new Stack<>();

        for (String str : arr) {
            if (str.equals("..") && !stack.isEmpty()) stack.pop();
            else if (!str.equals(".") && !str.equals("/") && !str.equals("") && !str.equals("..")) stack.add(str);
        }

        System.out.println(stack);
        List<String> ans = new ArrayList<>(stack);
        return "/" + String.join("/",ans);
    }
}
