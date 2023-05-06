import java.util.Arrays;

public class Q824 {
    public static void main(String[] args) {
        System.out.println(toGoatLatin("The quick brown fox jumped over the lazy dog"));
    }

    private static String toGoatLatin(String s) {
        StringBuilder ans = new StringBuilder();
        String[] arr = s.split(" ");
        String as = "a";
        for (String str : arr) {
            StringBuilder tmp = new StringBuilder(str);
            if (!str.startsWith("a") && !str.startsWith("e") && !str.startsWith("i") && !str.startsWith("o") && !str.startsWith("u")
            &&  !str.startsWith("A") && !str.startsWith("E") && !str.startsWith("I") && !str.startsWith("O") && !str.startsWith("U")) {
                var tmp2  = tmp.charAt(0);
                tmp.deleteCharAt(0);
                tmp.append(tmp2);
            }
            tmp.append("ma");
            tmp.append(as);
            as += "a";
            ans.append(tmp + " ");
        }
        ans.deleteCharAt(ans.length()-1);
        return ans.toString();
    }
}
