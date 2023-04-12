import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1078 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findOcurrences("alice is a good girl she is a good student", "a", "good")));
    }

    public static String[] findOcurrences(String text, String first, String second) {
        List<String> list = new ArrayList<>();

        String[] strings = text.split(" ");

        for (int i = 0; i < strings.length-2; i++) {
            if (strings[i].equals(first) && strings[i+1].equals(second)) list.add(strings[i+2]);
        }

        return list.toArray(new String[0]);
    }
}
