public class Q2181 {
    public static void main(String[] args) {
//        0,3,1,0,4,5,2,0
        ListNode n7 = new ListNode(0);
        ListNode n6 = new ListNode(2,n7);
        ListNode n5 = new ListNode(5,n6);
        ListNode n4 = new ListNode(4,n5);
        ListNode n3 = new ListNode(0,n4);
        ListNode n2 = new ListNode(1,n3);
        ListNode n1 = new ListNode(3,n2);
        ListNode head = new ListNode(0,n1);
        ListNode tmp = mergeNodes(head);
        while (tmp != null) {
            System.out.println(tmp.val);
            tmp = tmp.next;
        }
    }
    public static ListNode mergeNodes(ListNode head) {

        ListNode tmp = head.next;
        ListNode head2 = new ListNode();
        ListNode tmp2 = head2;
        int sum = 0;
        while(tmp != null){
            sum += tmp.val;
            if(tmp.val == 0){
                tmp2.next = new ListNode();
                tmp2.next.val = sum;
                tmp2 = tmp2.next;
                sum = 0;
            }
            tmp = tmp.next;
        }

        return head2.next;
    }
}
