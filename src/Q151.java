import java.util.Arrays;

public class Q151 {
    public static void main(String[] args) {
        System.out.println(reverseWords("the     sky is blue"));
    }

    private static String reverseWords(String s) {

        s = s.replaceAll("\\s+", " ").trim();
        String[] arr = s.split(" ");
        System.out.println(Arrays.toString(arr));
        String ans = "";
        for (int i = arr.length-1; i >= 0 ; i--) {

            ans += arr[i];
            if (i == 0) break;
            ans += " ";
        }
        System.out.println(ans);
        return "";
    }
}
