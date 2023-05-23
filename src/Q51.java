import java.util.ArrayList;
import java.util.List;

public class Q51 {
    public static void main(String[] args) {
        System.out.print(solveQueens(4));
    }

    private static List<List<String>> solveQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[0].length; j++)
                board[i][j] = '.';

        boolean[] lowerDignal = new boolean[n*2];
        boolean[] upperDignal = new boolean[n*2];
        boolean[] row = new boolean[n];
        List<List<String>> res = new ArrayList<>();
        backTrack(0, board, lowerDignal, upperDignal, row, res);
        return res;
    }

    private static void backTrack(int col, char[][] board, boolean[] lowerDignal, boolean[] upperDignal, boolean[] row, List<List<String>> res) {
        if (col >= board.length) {
            res.add(copyBoardToList(board));
            return;
        }

        for (int i = 0; i < board.length; i++) {
            if (canWePlaceItHere(i, col, lowerDignal, upperDignal, row, board.length)) {
                board[i][col] = 'Q';
                lowerDignal[i + col] =true;
                row[i] =true;
                upperDignal[(board.length -1) + (col -i)] =true;
                backTrack(col +1, board, lowerDignal, upperDignal, row, res);
                board[i][col] = '.';
                lowerDignal[i +col] =false;
                upperDignal[(board.length -1) + (col -i)] =false;
                row[i] =false;
            }
        }
    }

    private static boolean canWePlaceItHere(int i, int j, boolean[] lowerDignal, boolean[] upperDignal, boolean[] row, int n) {
        if (row[i]) return false;
        if (lowerDignal[i + j]) return false;
        return !upperDignal[(n - 1) + (j -i)];
    }

    private static List<String> copyBoardToList(char[][] board) {
        List<String> tmp = new ArrayList<>();
        for (char[] ch : board) {
            String tmpString = new String(ch);
            tmp.add(tmpString);
        }
        return tmp;
    }
}
