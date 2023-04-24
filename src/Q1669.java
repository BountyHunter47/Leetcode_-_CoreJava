import java.util.List;

public class Q1669 {
    public static void main(String[] args) {
        ListNode n6 = new ListNode(6);
        ListNode n5 = new ListNode(5, n6);
        ListNode n4 = new ListNode(4, n5);
        ListNode n3 = new ListNode(3, n4);
        ListNode n2 = new ListNode(2, n3);
        ListNode n1 = new ListNode(1, n2);
        ListNode l1 = new ListNode(0, n1);

        ListNode n8 = new ListNode(1000002);
        ListNode n7 = new ListNode(1000001, n8);
        ListNode l2 = new ListNode(1000000, n7);

        mergeInBetween(l1,3, 4, l2);
    }

    public static ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode bNode = list1;
        ListNode l2End = list2;
        ListNode l1Start = list1;
        int i = 0;

        while (i != b+1){
            bNode = bNode.next;
            i++;
        }
        while (l2End.next != null) {
            l2End = l2End.next;
        }
        int tmp = 1;
        while (tmp != a) {
            l1Start = l1Start.next;
            tmp++;
        }

        l1Start.next = list2;
        l2End.next = bNode;
        
        ListNode tmpNode = list1;
        while (tmpNode != null) {
            System.out.println(tmpNode.val);
            tmpNode = tmpNode.next;
        }
        return null;
    }
}
