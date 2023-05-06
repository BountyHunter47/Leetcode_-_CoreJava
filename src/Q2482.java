import java.util.Arrays;

public class Q2482 {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(onesMinusZero(new int[][]{{0, 1, 1}, {1, 0, 1}, {0, 0, 1}})));
    }

    private static int[][] onesMinusZero(int[][] mat) {
        int[] row = new int[mat.length];
        int[] col = new int[mat[0].length];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    row[i]++;
                    col[j]++;
                }
            }
        }

        int[][] diff = new int[mat.length][mat[0].length];

        for (int i = 0; i < diff.length; i++) {
            for (int j = 0; j < diff[0].length; j++) {
                var onesRow = row[i];
                var onesCol = col[j];
                var zeroRow = mat[0].length - row[i];
                var zeroCol = mat.length - col[j];
                diff[i][j] = onesRow + onesCol - zeroRow - zeroCol;
            }
        }
        return diff;
    }
}
