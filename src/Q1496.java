import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Q1496 {
    public static void main(String[] args) {
        System.out.println(isPathCrossing("NESWW"));
    }

    private static boolean isPathCrossing(String s) {
        HashSet<String> map = new HashSet<>();

        int x = 0, y = 0;
        map.add(x+" "+y);


        for (char ch : s.toCharArray()) {
            if (ch == 'N') x++;
            if (ch == 'S') x--;
            if (ch == 'E') y++;
            if (ch == 'W') y--;

            if (map.contains(x+""+y)) return true;

            map.add(x+" "+y);
        }
        return false;
    }
}
