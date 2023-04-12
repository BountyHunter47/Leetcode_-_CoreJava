import java.util.*;

public class Q1019 {
    public static void main(String[] args) {
        ListNode n4 = new ListNode(5);
        ListNode n3 = new ListNode(3,n4);
        ListNode n2 = new ListNode(4,n3);
        ListNode n1 = new ListNode(7, n2);
        ListNode head = new ListNode(2, n1);
        System.out.println(Arrays.toString(nextLargerNodes(head)));
    }

    public static int[] nextLargerNodes(ListNode head) {
            int idx = 0;
            ListNode tmp = head;
            while (tmp != null) {
                idx++;
                tmp = tmp.next;
            }
            int[] nums = new int[idx];
            int idx2 = 0;
            ListNode tmpNode = head;

            while (tmpNode != null) {
                nums[idx2++] = tmpNode.val;
                tmpNode = tmpNode.next;
            }
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j] > nums[i]) {
                    nums[i] = nums[j];
                    break;
                }else nums[i] = 0;
            }
        }
            return nums;
    }
}
