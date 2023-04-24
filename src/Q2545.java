import java.util.Arrays;

public class Q2545 {
    public static void main(String[] args) {
        int[][] mat = {{10,8,9,1}, {7,5,11,2}, {4,8,3,15}};
        System.out.println(Arrays.deepToString(sortTheStudents(mat, 2)));
    }

    private static int[][] sortTheStudents(int[][] mat, int k) {

        for (int i = 0; i < mat.length; i++) {
            int idx = findTheMax(mat, k, i);
            for (int j = 0; j < mat[i].length; j++) {
                if (idx == i) break;
                int tmp = mat[idx][j];
                mat[idx][j] = mat[i][j];
                mat[i][j] = tmp;
            }
        }
        return mat;
    }

    private static int findTheMax(int[][] mat, int k, int start) {
        int max = Integer.MIN_VALUE;
        int ans = 0;

        for (int i = start; i < mat.length; i++) {
            if (mat[i][k] > max) {
                max = mat[i][k];
                ans = i;
            }
        }

        return ans;
    }
}
