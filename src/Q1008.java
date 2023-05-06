public class Q1008 {
    public static void main(String[] args) {
        System.out.println(helper(new int[] {8,5,1,7,10,12}, 0, 5).val);

    }
    private static TreeNode helper(int[] preorder, int start, int end) {
        if(start > end) return null;

        TreeNode node = new TreeNode(preorder[start]);
        int i;
        for(i=start;i<=end;i++) {
            if(preorder[i] > node.val)
                break;
        }

        node.left = helper(preorder, start+1, i-1);
        node.right = helper(preorder, i, end);
        return node;
    }
}
