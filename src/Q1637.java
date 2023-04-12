import java.util.Arrays;

public class Q1637 {
    public static void main(String[] args) {
        System.out.println(maxWidthOfVerticalArea(new int[][]{{8,7},{9,9},{7,4},{9,7}}));
    }
    public static int maxWidthOfVerticalArea(int[][] points) {
        int[] freq = new int[points.length];
        for (int i = 0; i < points.length; i++) {
            freq[i] = points[i][0];
        }
        System.out.println(Arrays.toString(freq));
        Arrays.sort(freq);
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < freq.length-1; i++) {
            ans = Math.max(ans, Math.abs(freq[i]-freq[i+1]));
        }
        return ans;
    }
}
