import java.util.Objects;

public class Q1598 {
    public static void main(String[] args) {
        System.out.println(minOperations(new String[]{"./","../","./"}));
    }
    public static int minOperations(String[] logs) {

        int ans = 0;
        for (String str : logs) {
            if (Objects.equals(str, "../") && ans != 0)  ans--;
            else if (!Objects.equals(str, "./") && !Objects.equals(str, "../")) ans++;
        }

        return ans;
    }
}
