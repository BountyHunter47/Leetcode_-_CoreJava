import java.util.Arrays;

public class Q2639 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findColumnWidth(new int[][]{{-15,1,3}, {15,7,12}, {5,6,-2}})));
    }

    public static int[] findColumnWidth(int[][] mat) {
        int[] ans = new int[mat[0].length];

        int idx = 0;
        for (int i = 0; i < mat[0].length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < mat.length; j++) {
                String tmp = String.valueOf(mat[j][i]);
                if (tmp.length() > max) {
                    max = tmp.length();
                }
            }
            ans[idx++] = max;
        }

        return ans;
    }
}
