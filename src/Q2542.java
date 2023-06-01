import java.util.Arrays;
import java.util.PriorityQueue;

public class Q2542 {
    public static void main(String[] args) {
        System.out.println(maxScore(new int[] {1,3,3,2}, new int[] {2,1,3,4}, 3));
    }

    private static long maxScore(int[] nums1, int[] nums2, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int[][] mat = new int[nums1.length][2];

        for (int i = 0; i < nums1.length; i++) {
            mat[i][0] = nums1[i];
            mat[i][1] = nums2[i];
        }
        Arrays.sort(mat, (a, b) -> b[1] -a[1]);

        long max = 0;
        long sum = 0;
        for (int i = 0; i < mat.length; i++) {
            pq.add(mat[i][0]);
            sum += mat[i][0];
            if (pq.size() == k) {
                max = Math.max(max, sum * mat[i][1]);
                sum -= pq.remove();
            }
        }
        return max;
    }
}
