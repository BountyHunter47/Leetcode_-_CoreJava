import java.util.ArrayList;
import java.util.List;

public class Q2194 {
    public static void main(String[] args) {
        System.out.println(cellInRange("K1:L2"));
    }

    private static List<String> cellInRange(String s) {
        List<String> list = new ArrayList<>();
        for (int i = s.charAt(0); i <= s.charAt(3); i++) {
            for (int j = s.charAt(1); j <= s.charAt(4); j++) {
                list.add((char)i+""+(char)j);
            }
        }
        return list;
    }
}
