import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Q2500_DeleteGreatestValueinEachRow {
    public static void main(String[] args) {
        int[][] grid = {{9,81},{33,17}};
        List<String> list = new ArrayList<>();

        int i= 2;
        char temp = (char) ('a' +i);
        System.out.println(temp);
        list.add(String.valueOf(temp));
        System.out.println(list);
        System.out.println(deleteGreatestValue(grid));
    }

    private static int deleteGreatestValue(int[][] grid) {
        for(int[] row1 : grid){
            Arrays.sort(row1);
        }

        int ans = 0;
        for(int i = 0; i < grid[0].length; i++){
            int max = Integer.MIN_VALUE;
            for(int[] row : grid){
                max = Math.max(row[i],max);
            }
            ans += max;
        }

        return ans;
    }
}
