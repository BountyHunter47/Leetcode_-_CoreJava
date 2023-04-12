import java.util.List;

public class Q2095 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);

        ListNode tmp = deleteMiddle(head);
        while (tmp != null) {
            System.out.println(tmp.val);
            tmp = tmp.next;
        }
    }
    public static ListNode deleteMiddle(ListNode head) {
        ListNode ans = head;
        ListNode slow = head;
        int idx = 0;
        while (slow != null) {
            slow = slow.next;
            idx++;
        }
//        System.out.println(slow.val);
        idx /= 2;
        int checker = 0;
        ListNode tmp = head;
        while (tmp != null) {
            if (checker == idx-1) {
                tmp.next = tmp.next.next;
                break;
            }
            tmp = tmp.next;
            checker++;
        }

        return ans;
    }

}
