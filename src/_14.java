public class _14 {
    public static void main(String[] args) {
        System.out.println(checkCharAndDigits("AAA444aaa111"));
    }

    private static boolean checkCharAndDigits(String s) {

        int chars = 0, digits = 0;

        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z' ||(ch >= 'A' && ch <= 'Z')) chars++;
            if (ch >= '0' && ch <= '9') digits++;
        }
        return chars == digits;
    }
}
