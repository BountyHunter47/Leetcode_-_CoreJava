import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q113 {
    public static void main(String[] args) {
        pathSum(createTree(), 22);
        list = new ArrayList<>();
        for (List<Integer> i : list) {
            System.out.println(i);
        }
    }

    static List<List<Integer>> list;
    static List<Integer> subList;

    public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        int sum = 0;
        dfs (root, targetSum, sum, subList);
        return list;
    }

    static void dfs (TreeNode root, int target, int sum, List<Integer> subList) {
        if (root == null) return;
        sum += root.val;
        subList.add(root.val);
        if (sum == target && root.left == null && root.right == null) list.add(subList);
        dfs (root.left, target, sum, subList);
        dfs (root.right, target, sum, subList);
    }
    static TreeNode createTree() {
        Scanner sc = new Scanner(System.in);
        TreeNode root = null;

        System.out.println("Enter Value : ");
        int data = sc.nextInt();

        if(data < 0) return null;
        root = new TreeNode(data);

        System.out.println("Enter left for " + data);
        root.left = createTree();

        System.out.println("Enter right for " + data);
        root.right = createTree();

        return root;
    }
}
