public class Q1455 {
    public static void main(String[] args) {
        System.out.println(isPrefixOfWord("i love eating burger", "burg"));
    }
    public static int isPrefixOfWord(String sentence, String searchWord) {
        String[] strings = sentence.split(" ");

        int ans = 0;
        for (String str : strings) {
            ans++;
            if (str.length() >= searchWord.length()) {
                if (str.startsWith(searchWord)) return ans;
            }
        }

        return -1;
    }
}
