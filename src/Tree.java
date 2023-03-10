import java.util.ArrayList;
import java.util.Scanner;

class Tree{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Node root = createTree();
        System.out.println("Inorder");
        inOrder(root);
        System.out.println();
        System.out.println("Preorder");
        preOrder(root);
        System.out.println();
        System.out.println("Postorder");
        postOrder(root);
    }

    static Node createTree() {
        Scanner sc = new Scanner(System.in);
        Node root = null;

        System.out.println("Enter Value : ");
        int data = sc.nextInt();

        if(data < 0) return null;
        root = new Node(data);

        System.out.println("Enter left for " + data);
        root.left = createTree();

        System.out.println("Enter right for " + data);
        root.right = createTree();

        return root;
    }

    static void inOrder(Node root){
        if(root == null) return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    static void preOrder(Node root){
        if(root == null) return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    static void postOrder(Node root){
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

}
