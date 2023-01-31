//import java.util.ArrayList;
//import java.util.List;
//
//public class Q100_SameTree {
//    static List<Integer> list1;
//    static List<Integer> list2;
//
//    public static void main(String[] args) {
//        Node p = new Node(0);
//        Node q = new Node(1);
//
//        isSameTree(p,q);
//    }
//
//    public static boolean isSameTree(Node p, Node q) {
//        list1 = new ArrayList<>();
//        list2 = new ArrayList<>();
//        if(list1.size() != list2.size()) return false;
//        firstTree(p);
//        secondTree(q);
//
//        for(int i = 0;i < list1.size(); i++){
//            if(list1.get(i) != list2.get(i)) return false;
//        }
//
//        return true;
//    }
//
//    static Node firstTree(Node root){
//        if(root == null) return root;
//        firstTree(root.left);
//        list1.add(root.val);
//        firstTree(root.right);
//        return root;
//    }
//
//
//    static Node secondTree(Node root){
//        if(root == null) return root;
//        secondTree(root.left);
//        list2.add(root.val);
//        secondTree(root.right);
//        return root;
//    }
//}
