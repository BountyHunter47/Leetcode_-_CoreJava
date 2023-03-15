public class Q404 {
    static int sum = 0;
    public static void main(String[] args) {
        var q = new Q404();
        var head = new TreeNode(1);
        var left = new TreeNode(2);
        var right = new TreeNode(3);
        var rightLeft = new TreeNode(4);
        var rightRight = new TreeNode(5);
        head.left = left;
        head.right = right;
        head.left.left = rightLeft;
        head.left.right = rightRight;
        q.sumOfLeftLeaves(head);
        System.out.println(sum);
    }

    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;
        if(root.left != null && root.left.left == null && root.left.right == null) sum += root.left.val;
        var leftTree = sumOfLeftLeaves(root.left);
        var rightTree = sumOfLeftLeaves(root.right);
        return leftTree+ rightTree;
    }
}
