import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {
//        TreeNode n2 = new TreeNode(3);
//        TreeNode n1 = new TreeNode(2);
        TreeNode root = new TreeNode(1);

//        int height = getHeight(root);
//        printTree(root, height);
//        optimizedBFS(root);
        for (List<Integer> i : levelOrder(root)) {
            for (int val : i) System.out.println(val);
        }
    }
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> subList = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if (root == null) return list;
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            TreeNode cur = q.poll();

            if (cur == null && q.isEmpty()){
                list.add(subList);
                return list;
            }
            if (cur == null) {
                list.add(subList);
                q.add(null);
                subList = new ArrayList<>();
                continue;
            }
            subList.add(cur.val);
            if (cur.left != null) q.add(cur.left);
            if (cur.right != null) q.add(cur.right);
        }
        return list;
    }

    private static void optimizedBFS(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            TreeNode cur = q.poll();
            if (cur == null) {
                if (!q.isEmpty()) {
                    System.out.println();
                    q.add(null);
                    continue;
                }else return;
            }
            System.out.print(cur.val + " ");

            if (cur.left != null) q.add(cur.left);
            if (cur.right != null) q.add(cur.right);
        }
    }

    private static int getHeight(TreeNode root) {
        if (root == null) return 0;
        return Math.max(getHeight(root.left), getHeight(root.right))+ 1;
    }

    private static void printTree(TreeNode root, int lvl) {
        int tmp = 1;
        while (tmp <= lvl) {
            printLevelOrder(root, tmp);
            System.out.println();
            tmp++;
        }
    }

    private static void printLevelOrder(TreeNode root, int lvl) {
        if (root == null) return;
        else if (lvl == 1) System.out.print(root.val + " ");
        else if (lvl > 1) {
            printLevelOrder(root.left, lvl-1);
            printLevelOrder(root.right, lvl-1);
        }
    }
}
