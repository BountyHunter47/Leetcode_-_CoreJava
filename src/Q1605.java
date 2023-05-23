import java.util.Arrays;

public class Q1605 {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(restoreMat(new int[]{3,8}, new int[]{4,7
        })));
    }

    private static int[][] restoreMat(int[] row, int[] col) {
        int[][] mat =new int[row.length][col.length];


        for (int i =0; i < mat.length; i++) {
            int val = Integer.MAX_VALUE;
            for (int x : col) if (x != 0) val = Math.min(x, val);
            for (int x : row) if (x != 0) val = Math.min(x, val);
            for (int j =0; j < mat[0].length; j++) {
                if (row[i] == 0 || col[j] == 0) {
                    mat[i][j] = 0;
                    continue;
                }
                if (i != mat.length -1 && j != mat[0].length -1) {
                    mat[i][j] =val;
                    row[i] -=val;
                    col[j] -=val;
                }
                if (j == mat[0].length -1 && row[i] != 0) {
                    mat[i][j] = row[i];
                    row[i] -=mat[i][j];
                    col[j] -=mat[i][j];
                }
                else if (i == mat.length -1 && col[j] != 0) {
                    mat[i][j] = col[j];
                    row[i] -= mat[i][j];
                    col[j] -= mat[i][j];
                }
            }
        }
        return mat;
    }
}
