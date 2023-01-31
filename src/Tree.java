import java.util.ArrayList;
import java.util.Scanner;

class Tree{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Node root = createTree();
        inOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
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
        inOrder(root.left);
        inOrder(root.right);
    }
    static void postOrder(Node root){
        if(root == null) return;
        inOrder(root.left);
        inOrder(root.right);
        System.out.print(root.data+" ");
    }

}
