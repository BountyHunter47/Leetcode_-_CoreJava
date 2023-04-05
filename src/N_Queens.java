import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N_Queens {
    static List<int[][]> list;
    static List<List<String>> ans = new ArrayList<>();
    public static void main(String[] args) {
        int[][] chess = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
        list = new ArrayList<>();
        System.out.println(backTracking(chess, 0));
    }

    static boolean backTracking(int[][] board, int row){
        if (row == board.length) {
            list.add(board);
            List<String> tmpString = new ArrayList<>();
                StringBuilder sb = new StringBuilder();
                for (int[] r : board){
                    StringBuilder tmp = new StringBuilder();
                    for (int c : r) {
                        if (c == 1) tmp.append('Q');
                        else tmp.append('.');
                    }
                    tmpString.add(String.valueOf(tmp));
                }
                ans.add(tmpString);
//            System.out.println(Arrays.deepToString(board));
            System.out.println(ans);
            return false;
        }

        for (int i = 0; i < board[0].length; i++) {
            if (isSafeToPlaceQueen(board,row,i)) {
                board[row][i] = 1;
                if (backTracking(board, row+1)) return true;
                else board[row][i] = 0;
            }
        }
        return false;
    }

    private static boolean isSafeToPlaceQueen(int[][] board, int row, int col) {
        for (int j = 0; j < board[0].length; j++) if (board[row][j] == 1) return false;
        for (int j = 0; j < board[0].length; j++) if (board[j][col] == 1) return false;

        int r = row, c = col;
        while (r < board.length && c < board[0].length) {
            if (board[r][c] == 1) return false;
            r++;
            c++;
        }

        r = row; c = col;
        while (r < board.length && c >= 0) {
            if (board[r][c] == 1) return false;
            r++;
            c--;
        }

        r = row; c = col;
        while (r >= 0 && c < board[0].length) {
            if (board[r][c] == 1) return false;
            r--;
            c++;
        }

        r = row; c = col;
        while (r >= 0 && c >= 0) {
            if (board[r][c] == 1) return false;
            r--;
            c--;
        }

        return true;
    }
}
