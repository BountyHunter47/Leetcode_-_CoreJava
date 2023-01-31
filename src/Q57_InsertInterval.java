import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q57_InsertInterval {
    public static void main(String[] args) {
        int[][] intervals= {{1,3},{6,9}};
        int[] newInterval = {2,5};
        
        System.out.println(Arrays.deepToString(insert(intervals, newInterval)));
    }

    private static int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        int[] start = new int[n];
        int[] end = new int[n];

        for (int i = 0; i < n; i++) {
            start[i] = intervals[i][0];
        }

        for (int i = 0; i < n; i++) {
            end[i] = intervals[i][1];
        }

        List<int[]> list = new ArrayList<>();
        int idx = 0;

        while (idx < n && end[idx] < newInterval[0]){
            list.add(new int[]{start[idx],end[idx]});
            idx++;
        }
        while (idx < n && start[idx] <= newInterval[1]){
            newInterval[0] = Math.min(start[idx],newInterval[0]);
            newInterval[1] = Math.max(end[idx],newInterval[1]);
            idx++;
        }
        list.add(newInterval);
        while (idx < n){
            list.add(new int[]{start[idx],end[idx]});
            idx++;
        }
        return list.toArray(new int[list.size()][]);
    }
}
