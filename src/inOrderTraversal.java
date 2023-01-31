import java.util.ArrayList;

public class inOrderTraversal {
    static ArrayList<Integer> list;

    public static void main(String[] args) {
        list = new ArrayList<>();
        Node root = new Node(10);
        root.left = new Node(20);
        root.left.left = new Node(30);
        root.left.right = new Node(40);

        getList(root);
        System.out.println(list);
    }

    static Node getList(Node root){
        if(root == null) return root;
        getList(root.left);
        list.add(root.data);
        getList(root.right);
        return root;
    }
}
