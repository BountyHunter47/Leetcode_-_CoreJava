import java.util.Arrays;

public class Q2120 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(executeInstruction(3, new int[]{0, 1}, "RRDDLU")));
    }

    private static int[] executeInstruction(int n, int[] nums, String s) {
        int[][] mat = new int[n][n];
        int[] ans = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            int row = nums[0];
            int col = nums[1];
            int sum = 0;
            for (int j = i; j < s.length(); j++) {
                if (s.charAt(j) == 'R') {
                    if (col+1 >= mat[0].length) break;
                    else {
                        col++;
                        sum++;
                    }
                }
                else if (s.charAt(j) == 'L') {
                    if (col-1 < 0) break;
                    else {
                        col--;
                        sum++;
                    }
                }
                else if (s.charAt(j) == 'U') {
                    if (row - 1 < 0) break;
                    else {
                        row--;
                        sum++;
                    }
                }
                else if (s.charAt(j) == 'D') {
                    if (row + 1 >= mat.length) break;
                    else {
                        row++;
                        sum++;
                    }
                }
            }
            ans[i] = sum;
        }


        return ans;
    }
}
