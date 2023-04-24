import java.util.List;

public class Q2487 {
    public static void main(String[] args) {
        ListNode n4 = new ListNode(8);
        ListNode n3 = new ListNode(3, n4);
        ListNode n2 = new ListNode(13, n3);
        ListNode n1 = new ListNode(2, n2);
        ListNode head = new ListNode(5, n1);
        removeNode(head);
    }

    private static ListNode removeNode(ListNode head) {
        ListNode tmp = reverseList(head);
        int max= tmp.val;
        ListNode nn = new ListNode(max);
        ListNode tmpNN = nn;
        ListNode cur = tmp;

        while (cur != null) {
            if (cur.val >= max) {
                max = cur.val;
                nn.next = new ListNode(max);
                nn = nn.next;
            }
            cur = cur.next;
        }

        ListNode ans = reverseList(tmpNN);
        printList(ans);
        return nn;
    }

    private static void printList(ListNode head) {
        ListNode tmp = head;
        while (tmp != null) {
            System.out.println(tmp.val);
            tmp = tmp.next;
        }
    }

    private static ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode prev = null;

        while (cur != null) {
            if (cur.next == null) {
                cur.next = prev;
                head = cur;
                return head;
            }
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return cur;
    }
}
