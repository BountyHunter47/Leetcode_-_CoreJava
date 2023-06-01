import java.util.*;

public class Q2225 {
    public static void main(String[] args) {
        System.out.println(findWinner(new int[][] {{1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}}));
    }

    private static List<List<Integer>> findWinner(int[][] mat) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> zeroLose = new ArrayList<>();
        List<Integer> oneLose = new ArrayList<>();

        Set<Integer> checker = new HashSet<>();

        for (int i = 0; i < mat.length; i++) map.put(mat[i][1], map.getOrDefault(mat[i][1], 0) +1);
        for (int i = 0; i < mat.length; i++) if (!map.containsKey(mat[i][0]) && !checker.contains(mat[i][0])){
            checker.add(mat[i][0]);
            zeroLose.add(mat[i][0]);
        }

        for (int i : map.keySet()) if (map.get(i) == 1) oneLose.add(i);
        Collections.sort(zeroLose);
        Collections.sort(oneLose);

        return List.of(zeroLose, oneLose);
    }
}