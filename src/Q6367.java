public class Q6367 {
    public static void main(String[] args) {
        System.out.println(matrixSum(new int[][] {{7,2,1},{6,4,2},{6,5,3},{3,2,1}}));
    }

    private static int matrixSum(int[][] mat) {
        int ans = 0;

        for (int i = 0; i < mat[0].length; i++) {
            int finalMax = Integer.MIN_VALUE;
            for (int j = 0; j < mat.length; j++) {
                int max = Integer.MIN_VALUE;
                int idx = 0;
                for (int k = 0; k < mat[0].length; k++) {
                    if (mat[j][k] > max) {
                        max = mat[j][k];
                        idx = k;
                    }
                }
                mat[j][idx] = -1;
                finalMax = Math.max(max, finalMax);
            }
            ans += finalMax;
        }

        return ans;
    }
}
