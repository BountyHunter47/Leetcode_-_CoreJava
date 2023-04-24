public class Q1372 {
    public static void main(String[] args) {
        TreeNode n7 = new TreeNode(7);
        TreeNode n6 = new TreeNode(7);
        TreeNode n5 = new TreeNode(6);
        TreeNode n4 = new TreeNode(5, n6, n7);
        TreeNode n3 = new TreeNode(4, n4, n5);
        TreeNode n2 = new TreeNode(3);
        TreeNode n1 = new TreeNode(2, n2, n3);
        TreeNode root = new TreeNode(1, null, n1);

//        printTree(root);
        System.out.println(dfs(root));
    }

    static void printTree(TreeNode root) {
        if (root == null) return;
        printTree(root.left);
        System.out.println(root.val);
        printTree(root.right);
    }
    private static int dfs(TreeNode root) {
        if (root == null) return 0;
        maxZigZag(root, root.left);
        maxZigZag(root, root.right);
        ans = Math.max(left, Math.max(right, ans));
        left = 0;
        right = 0;
        dfs(root.left);
        dfs(root.right);
        return Math.max(left, right);
    }

    static int ans = 0;
    static int right = 0;
    static int left = 0;
    private static int maxZigZag(TreeNode root, TreeNode direction) {
        if (direction == null) return 0;
        if (direction == root.left)  left = Math.max(maxZigZag(direction, direction.right) + 1, left);
        if (direction == root.right) right = Math.max(maxZigZag(direction, direction.left) + 1, right);
        return Math.max(left, right);
    }
}
