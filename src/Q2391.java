import java.util.Arrays;

public class Q2391 {
    public static void main(String[] args) {
        System.out.println(garbageCollection(new String[]{"G","P","GP","GG"},new int[]{2,4,3}));
    }

    public static int garbageCollection(String[] garbage, int[] travel) {
        int[] G = new int[garbage.length];
        int[] P = new int[garbage.length];
        int[] M = new int[garbage.length];

        int m = 0, p = 0, g = 0;
        int mTotal = 0, pTotal = 0, gTotal = 0;
        int[] pre = new int[travel.length];
        pre[0] = travel[0];
        for (int i = 1; i < travel.length; i++) {
            pre[i] =  pre[i-1] + travel[i];
        }
        System.out.println(Arrays.toString(pre));

        for (int i = 0; i < garbage.length; i++) {
            for (int j = 0; j < garbage[i].length(); j++) {
                if (garbage[i].charAt(j) == 'G') G[i]++;
                else if (garbage[i].charAt(j) == 'M') M[i]++;
                else if (garbage[i].charAt(j) == 'P') P[i]++;
            }
        }
        for (int i = 0; i < G.length; i++) {
            if (G[i] > 0 && i != 0) g = pre[i-1];
            gTotal += G[i];
        }
        for (int i = 0; i < M.length; i++) {
            if (M[i] > 0 && i != 0) m = pre[i-1];
            mTotal += M[i];
        }
        for (int i = 0; i < P.length; i++) {
            if (P[i] > 0 && i != 0) p = pre[i-1];
            pTotal += P[i];
        }


        return m + p + g + mTotal + gTotal + pTotal;
    }
}
