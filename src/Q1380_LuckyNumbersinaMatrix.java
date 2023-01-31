import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1380_LuckyNumbersinaMatrix {
    public static void main(String[] args) {
        int[][] mat = {{3,1,8},{20,11,13},{15,16,17}};
        Arrays.sort(mat,(a,b) -> b[0] - a[0]);
//        Arrays.sort(mat,(a,b) -> a[1] - b[1]);
        System.out.println(Arrays.deepToString(mat));
        System.out.println(luckyNumbers(mat));
    }

    private static List<Integer> luckyNumbers(int[][] mat) {
        int col = 0;
        int row = 0;

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < mat.length; i++){
            int min = Integer.MAX_VALUE;
            boolean flag = true;
            for(int j = 0; j < mat[0].length; j++){
                // min = Math.min(min,mat[i][j]);
                if(mat[i][j] < min){
                    col = j;
                    row = i;
                    min = mat[i][j];
                }
            }
            for(int k = 0; k < mat.length; k++){
                if(mat[k][col] > min) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                list.add(mat[row][col]);
                return list;
            }

        }
        return list;
    }
}
