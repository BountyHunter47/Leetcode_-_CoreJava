import java.util.Scanner;

public class levelOrderTreeTreaversel {
    public static void main(String[] args) {
        Node root = createTree();
    }
    static Scanner sc = new Scanner(System.in);
    static Node createTree(){
        System.out.println("Enter Value : ");
        Node root = null;

        int data = sc.nextInt();

        if (data < 0) return root;
        root = new Node(data);

        System.out.println("Enter value for left Node : " + data);
        root.left = createTree();

        System.out.println("Enter value for right Node : " + data);
        root.right = createTree();

        return root;
    }

}
