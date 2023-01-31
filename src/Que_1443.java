import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Que_1443 {
    public static void main(String[] args) {
        int n = 7;
        int[][] edges = {{0, 1}, {0, 2}, {1, 4}, {1, 5}, {2, 3}, {2, 6}};
        List<Boolean> hasApple = new ArrayList<>(Arrays.asList(false,false,true,false,true,true,false));

        System.out.println(minTime(n, edges, hasApple));
    }

    private static int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        List<List<Integer>> adj_list = new ArrayList<>();
        for (int i = 0; i < n; i++) adj_list.add(new ArrayList<>());
        for (int[] edge : edges) {
            adj_list.get(edge[0]).add(edge[1]);
            adj_list.get(edge[1]).add(edge[0]);
        }
        boolean[] visited = new boolean[n];
        return dfs(0, adj_list, hasApple, visited);
    }

    private static int dfs(int curr, List<List<Integer>> adj_list, List<Boolean> hasApple, boolean[] visited) {
        visited[curr] = true;
        int ans = 0;
        for (Integer child : adj_list.get(curr)) {
            if (visited[child]) continue;
            ans += dfs(child, adj_list, hasApple, visited);
        }

        if ((ans > 0 || hasApple.get(curr)) && curr != 0) ans += 2;
        return ans;
    }
}
