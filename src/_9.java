public class _9 {
    public static void main(String[] args) {
        System.out.println(removeVowel("mahesh"));
    }

    private static String removeVowel(String s) {
        String ans = "";

        for (char ch : s.toCharArray()) if (ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' || ch == 'A' || ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U'){

        }else ans += ch;

        return ans;
    }
}
