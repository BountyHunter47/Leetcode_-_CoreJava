import java.util.Objects;

public class Q434 {
    public static void main(String[] args) {
        System.out.println(countSegments("    foo    bar"));
    }

    private static int countSegments(String s) {
        s = s.replaceAll("\\s+", " ").trim();
        if (Objects.equals(s, "")) return 0;

        String[] ans = s.split(" ");
        return ans.length;
    }
}
