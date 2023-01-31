public class Q2351_FirstLettertoAppearTwice {
    public static void main(String[] args) {
        String s = "abccbaacz";
        System.out.println(repeatedCharacter(s));
    }

    private static char repeatedCharacter(String s) {
        int[] freq = new int[26];

        for(char ch : s.toCharArray()) {
            if(freq[ch - 'a'] == 2) {
                return ch;
            }
            freq[ch - 'a']++;
        }
        return 'j';
    }
}
