public class Q2000 {
    public static void main(String[] args) {
        System.out.println(reversePrefix("abcdefd", 'z'));
    }
    public static String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        int checker = 0;
        var flag1 = false;
        var flag2 = false;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                checker++;
                flag1 = true;
            }
            if (checker >= 1 && flag2) sb.append(word.charAt(i));
            if (checker == 1 && flag1) {
                sb.append(word, 0, i+1);
                sb.reverse();
                flag1 = false;
                flag2 = true;
            }
        }

        return sb.toString().equals("") ? word : sb.toString();
    }
}
