import java.util.Arrays;

public class Q826 {
    public static void main(String[] args) {
       System.out.println(maxProfitAssignment(
               new int[] {66,1,28,73,53,35,45,60,100,44,59,94,27,88,7,18,83,18,72,63},
               new int[] {66,20,84,81,56,40,37,82,53,45,43,96,67,27,12,54,98,19,47,77},
               new int[]{61,33,68,38,63,45,1,10,53,23,66,70,14,51,94,18,28,78,100,16}));

    }

    private static int maxProfitAssignment(int[] dif, int[] prof, int[] worker) {
        int[] map = new int[100001];
       int[] freq = new int[101];
       for (int val : dif) freq[val]++;
        System.out.println(Arrays.toString(freq));
        for (int i = 0; i < dif.length; i++) {
            map[dif[i]] = prof[i];
        }
        int sum = 0, idx = 0;

        Arrays.sort(worker);

        int tmpSum = 0;
        for (int i = 0; i < worker.length; i++) {
            int limit = worker[i];
            while (idx <= limit) {
                tmpSum = Math.max(tmpSum, map[idx++]);
            }
            System.out.println(tmpSum);
            sum += tmpSum;
        }

        return sum;
    }
}
