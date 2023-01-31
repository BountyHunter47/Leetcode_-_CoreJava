import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Q452_MinimumNumberofArrowstoBurstBalloons {
    public static void main(String[] args) {
        int[][] points = {{10,16},{2,8},{1,6},{7,12},{7,17}};

        System.out.println(findMinArrowShots(points));
    }

    private static int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(a -> a[1]));
        int start = points[0][0];
        int end = points[0][1];
        int count = 1;

        for(int i = 0; i < points.length; i++){
            if(points[i][0] > end){
                count++;
                end = points[i][1];
            }
        }
        System.out.println(Arrays.deepToString(points));
        return count;
    }
}
