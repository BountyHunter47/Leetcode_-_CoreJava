import java.util.ArrayList;
import java.util.List;

public class Q1796_SecondLargestDigitaString {
    public static void main(String[] args) {
        String s = "lEeTcOdE";
        System.out.println(greatestLetter(s));
    }

    private static String greatestLetter(String s) {
        int[] small = new int[26];
        int[] capital = new int[26];

        for(char ch : s.toCharArray()){
            if(Character.isUpperCase(ch)) capital[ch - 'A']++;
            else small[ch - 'a']++;
        }

        for (int i = 25; i >= 0; i--){
            if(small[i] != 0 && capital[i] != 0){
                return String.valueOf ((char)(i+'A'));
            }
        }
        return "";
    }

    private static int secondHighest(String s) {
        List<Integer> list = new ArrayList<>();
        for(char ch : s.toCharArray()){
            if(ch - 'a' >= 48 && ch - 'a' <= 57){
                int ans = Character.getNumericValue(ch);
                list.add(ans);
            }
        }
        System.out.println(list);
        return 0;
    }
}
