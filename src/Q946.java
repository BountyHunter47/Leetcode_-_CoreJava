import java.util.Stack;

public class Q946 {
    public static void main(String[] args) {
        System.out.println(validateSequence(new int[]{1,0}, new int[]{1,0}));
    }

    private static boolean validateSequence(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();

        int pop = 0;

        for (int i = 0; i < nums1.length; i++) {
            stack.add(nums1[i]);
            if (nums1[i] == nums2[pop]) {
                while (!stack.isEmpty() && pop < nums2.length && stack.peek() == nums2[pop]) {
                    stack.pop();
                    pop++;
                }
            }
        }

        return stack.size()==0;
    }

}
