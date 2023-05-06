public class Q606 {
    public static void main(String[] args) {
        TreeNode n3 = new TreeNode(4);
        TreeNode n2 = new TreeNode(3);
        TreeNode n1 = new TreeNode(2, null, n3);
        TreeNode root = new TreeNode(1, n1, n2);
        Q606 q606 = new Q606();
        q606.dfs(root);
        System.out.println(q606.ans);
    }
    StringBuilder ans = new StringBuilder();
    private void dfs(TreeNode root) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            ans.append(root.val);
            return;
        }
        ans.append(root.val);
        ans.append('(');
        dfs(root.left);
        ans.append(')');

        if (root.right != null) {
            ans.append('(');
            dfs(root.right);
            ans.append(')');
        }
    }
}
