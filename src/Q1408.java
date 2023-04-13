import java.util.ArrayList;
import java.util.List;

public class Q1408 {
    public static void main(String[] args) {
        System.out.println(stringMatching(new String[]{"mass","as","hero","superhero"}));
    }

    private static List<String> stringMatching(String[] strings) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings.length; j++) {
                if (i == j) continue;
                if (strings[i].length() < strings[j].length() && strings[j].contains(strings[i]) && !list.contains(strings[i])) list.add(strings[i]);
            }
        }

        return list;
    }
}
