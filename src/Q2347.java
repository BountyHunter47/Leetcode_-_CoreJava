import java.util.Objects;

public class Q2347 {
    public static void main(String[] args) {
        System.out.println(bestHand(new int[]{13,2,3,1,9}, new char[] {'a','a','a','a','a'}));
    }

    private static String bestHand(int[] ranks, char[] suits) {
        char checker = suits[0];
        var flag = true;
        for (char s : suits) if (!Objects.equals(s, checker)) flag = false;
        if (flag) return "Flush";

        int[] freq = new int[13];
        for (int i : ranks) freq[i]++;
        for (int i : freq) if (i > 2) return "Three of a Kind";
        for (int i : freq) if (i == 2) return "Pair";

        return "High Card";
    }
}
