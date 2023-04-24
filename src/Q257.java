import java.util.ArrayList;
import java.util.List;

public class Q257 {
    public static void main(String[] args) {
//        TreeNode n5 = new TreeNode(51177);
//        TreeNode n4 = new TreeNode(51177);
        TreeNode n3 = new TreeNode(5);
        TreeNode n2 = new TreeNode(3);
        TreeNode n1 = new TreeNode(2, null, n3);
        TreeNode root = new TreeNode(1, n1, n2);
        dfs(root);
        System.out.println(list);
    }
    static List<String> list = new ArrayList<>();
    static StringBuilder sb = new StringBuilder();
    private static void dfs(TreeNode root) {
        if (root == null) return;

        if (root.left != null || root.right != null) sb.append(root.val).append("->");
        else sb.append(root.val);

        dfs(root.left);
        dfs(root.right);

        if (root.left == null && root.right == null) {
            list.add(new String(sb));
            while (sb.length() != 0 && sb.charAt(sb.length()-1) != '>'){
                sb.deleteCharAt(sb.length()-1);
            }
        }else {
            do {
                sb.deleteCharAt(sb.length()-1);
            }while (sb.length() != 0 && sb.charAt(sb.length()-1) != '>');
        }
    }
}
