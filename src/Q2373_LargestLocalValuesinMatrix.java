import java.util.Arrays;

public class Q2373_LargestLocalValuesinMatrix {
    public static void main(String[] args) {
        int[][] grid = {{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}};
        largestLocal(grid);
    }

    public static int[][] largestLocal(int[][] g) {
        int[][] nums = new int[g.length-2][g.length-2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                nums[i][j] = Math.max(g[i][j],
                        Math.max(g[i][j+1],
                        Math.max(g[i][j+2],
                        Math.max(g[i+1][j],
                        Math.max(g[i+1][j+1],
                        Math.max(g[i+1][j+2],
                        Math.max(g[i+2][j],
                        Math.max(g[i+2][j+1],g[i+2][j+2]))))))));
            }
        }
        System.out.println(Arrays.deepToString(nums));
        return nums;
    }

}
