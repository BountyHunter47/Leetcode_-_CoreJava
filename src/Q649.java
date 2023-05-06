import java.util.Collection;
import java.util.Collections;
import java.util.Objects;

public class Q649 {
    public static void main(String[] args) {
        System.out.println(predictPartyVictory("DRRDRDRDRDDRDRDR"));
    }

    private static String predictPartyVictory(String s) {
        int[] freq = new int[2];

        for (char ch : s.toCharArray()) {
            if (ch == 'D') freq[0]++;
            else freq[1]++;
        }
        StringBuilder sb = new StringBuilder(s);
        int tmpD = 0, tmpR = 0;

        while (!sb.isEmpty()) {
            String tmp = "";
            int i = 0;

            while (i < sb.length()) {
                if (sb.charAt(i) == 'D') {
                    if (freq[1] <= 0) return "Dire";
                    else if (tmpD != 0) {
                        while (i < sb.length() && tmpD != 0 && sb.charAt(i) == 'D') {
                            tmpD--;
                            i++;
                        }
                    }else {
                        tmp += sb.charAt(i);
                        freq[1]--;
                        if (freq[1] <= 0) return "Dire";
                        tmpR++;
                        i++;
                    }
                }

                if (i < sb.length() && sb.charAt(i) == 'R') {
                    if (freq[0] <= 0) return "Radiant";
                    else if (tmpR != 0) {
                        while (i < sb.length() && tmpR != 0 && sb.charAt(i) == 'R') {
                            tmpR--;
                            i++;
                        }
                    }else {
                        tmp += sb.charAt(i);
                        freq[0]--;
                        if (freq[0] <= 0) return "Radiant";
                        tmpD++;
                        i++;
                    }
                }
            }
            sb = new StringBuilder(tmp);
        }
        return null;
    }
}
