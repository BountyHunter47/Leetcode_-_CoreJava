import java.util.Arrays;
import java.util.Objects;

public class Q1275 {
    public static void main(String[] args) {

        System.out.println(tictactoe(new int[][]{{0,2}, {0,1}, {2,1}}));
    }

    private static String tictactoe(int[][] moves) {

        String[][] mat = new String[3][3];
        int idx = 0;
        if (moves.length < 3) return "Pending";

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (idx == moves.length) break;
                if (idx % 2 == 0) mat[moves[idx][0]][moves[idx][1]] = "X";
                else mat[moves[idx][0]][moves[idx][1]] = "O";
                idx++;
            }
        }
        System.out.println(Arrays.deepToString(mat));

        if (mat[0][0] != null && Objects.equals(mat[0][0], mat[1][1]) && Objects.equals(mat[1][1], mat[2][2])) {
            if (Objects.equals(mat[0][0], "X")) return "A";
            if (Objects.equals(mat[0][0], "O")) return "B";
        }
        if (mat[0][1] != null && Objects.equals(mat[0][1], mat[1][1]) && Objects.equals(mat[1][1], mat[2][1])) {
            if (Objects.equals(mat[0][1], "X")) return "A";
            if (Objects.equals(mat[0][1], "O")) return "B";
        }
        if (mat[0][2] != null && Objects.equals(mat[0][2], mat[1][1]) && Objects.equals(mat[1][1], mat[2][0])) {
            if (Objects.equals(mat[0][2], "X")) return "A";
            if (Objects.equals(mat[0][2], "O")) return "B";
        }
        if (mat[1][0] != null && Objects.equals(mat[1][0], mat[1][1]) && Objects.equals(mat[1][1], mat[1][2])) {
            if (Objects.equals(mat[1][0], "X")) return "A";
            if (Objects.equals(mat[1][0], "O")) return "B";
        }
        if (mat[0][0] != null && Objects.equals(mat[0][0], mat[0][1]) && Objects.equals(mat[0][1], mat[0][2])) {
            if (Objects.equals(mat[0][0], "X")) return "A";
            if (Objects.equals(mat[0][0], "O")) return "B";
        }
        if (mat[2][0] != null && Objects.equals(mat[2][0], mat[2][1]) && Objects.equals(mat[2][1], mat[2][2])) {
            if (Objects.equals(mat[2][0], "X")) return "A";
            if (Objects.equals(mat[2][0], "O")) return "B";
        }
        if (mat[0][0] != null && Objects.equals(mat[0][0], mat[1][0]) && Objects.equals(mat[1][0], mat[2][0])) {
            if (Objects.equals(mat[0][0], "X")) return "A";
            if (Objects.equals(mat[0][0], "O")) return "B";
        }
        if (mat[0][2] != null && Objects.equals(mat[0][2], mat[1][2]) && Objects.equals(mat[1][2], mat[2][2])) {
            if (Objects.equals(mat[0][2], "X")) return "A";
            if (Objects.equals(mat[0][2], "O")) return "B";
        }

            if (moves.length < 9) return "Pending";

        return "Draw";
    }
}
