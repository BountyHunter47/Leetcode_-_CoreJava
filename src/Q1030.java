import java.util.Arrays;

public class Q1030 {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(allCellsDistOrder(2, 3, 1, 2)));
    }

    private static int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] mat = new int[rows * cols][2];
        int idx = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[idx][0] = Math.abs(i - rCenter);
                mat[idx++][1] = Math.abs(j - cCenter);
            }
        }

        return mat;
    }
}
