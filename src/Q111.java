public class Q111 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(2);
        root.right.right.right = new TreeNode(2);
        root.right.right.right.right = new TreeNode(2);
        System.out.println(minDepth(root));
    }

    public static int minDepth(TreeNode root) {
        if(root==null)  return 0;
        if(root.left==null && root.right==null) return 1;
        if(root.left==null) return 1+minDepth(root.right);
        if(root.right==null) return 1+minDepth(root.left);
        return Math.min(minDepth(root.left), minDepth(root.right))+1;
    }
}
