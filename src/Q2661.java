public class Q2661 {
    public static void main(String[] args) {
        System.out.println(firstCompleteIndex(new int[] {1,4,5,2,6,3}, new int[][] {{4,3,5}, {1,2,6}}));
    }

    private static int firstCompleteIndex(int[] nums, int[][] mat) {
        int row[] = new int[mat.length];
        int col[] = new int[mat[0].length];

        int[] matRow = new int[(mat.length * mat[0].length) + 1];
        int[] matCol = new int[(mat.length * mat[0].length) + 1];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                matRow[mat[i][j]] = i;
                matCol[mat[i][j]] = j;
            }
        }

        int ans = 0;
        for (int i : nums) {
            if (colorTheMatrix(i, mat, row, col, matRow, matCol)) return ans;
            ans++;
        }
        return -1;
    }

    private static boolean colorTheMatrix(int k,int[][] mat, int[] row, int[] col, int[] matRow, int[] matCol) {
        row[matRow[k]]++;
        col[matCol[k]]++;
        return col[matCol[k]] == mat.length || row[matRow[k]] == mat[0].length;
    }
}
