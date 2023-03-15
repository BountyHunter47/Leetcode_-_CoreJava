import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Q143 {
    public static void main(String[] args) {
        ListNode l4 = new ListNode(5);
        ListNode l3 = new ListNode(4,l4);
        ListNode l2 = new ListNode(3,l3);
        ListNode l1 = new ListNode(2,l2);
        ListNode head = new ListNode(1,l1);
        var q = new Q143();
        q.reorderList(head);

        ListNode tmp2 = head;
        while (tmp2 != null){
            System.out.println(tmp2.val);
            tmp2 = tmp2.next;
        }
    }
    public void reorderList(ListNode head) {
        ListNode p1 = head;
        ListNode p2 = head;
        while(p2.next != null && p2.next.next != null){
            p1 = p1.next;
            p2 = p2.next.next;
        }

        ListNode preMiddle = p1;
        ListNode preCurr = p1.next;

        while (preCurr.next != null){
            var curr = preCurr.next;
            preCurr.next = curr.next;
            curr.next = preMiddle.next;
            preMiddle.next = curr;
        }

        p1 = head;
        p2 = preMiddle.next;
        while (p1 != preMiddle){
            preMiddle.next = p2.next;
            p2.next = p1.next;
            p1.next = p2;
            p1 = p2.next;
            p2 = preMiddle.next;
        }

    }
}
