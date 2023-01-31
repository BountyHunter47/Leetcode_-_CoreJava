import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q1002_FindCommonCharacters {
    public static void main(String[] args) {
        String[] words = {"bella","label","roller"};
        System.out.println(commonChars(words));
    }

    private static List<String> commonChars(String[] words) {
        List<String> list = new ArrayList<>();
        int[] freq = new int[26];
        for(int i = 0; i < words[0].length(); i++){
            freq[words[0].charAt(i) - 'a']++;
        }

        for(String s : words){
            int[] freq2 = new int[26];
            for(char ch : s.toCharArray()){
                freq2[ch - 'a']++;
            }
            for(int i = 0; i < words[0].length(); i++){
                int temp = freq2[words[0].charAt(i) - 'a'];
                if(temp == 0){
                    freq[words[0].charAt(i) - 'a'] = 0;
                } else  {
                    freq[words[0].charAt(i) - 'a'] = Math.min(freq[words[0].charAt(i) - 'a'] ,freq2[words[0].charAt(i) - 'a'] );
                }
            }
            for (int i = 0; i < freq.length; i++) {
                if(freq[i] > 0){
                    list.add(String.valueOf(i + 'a'));
                }
            }
        }
        System.out.println(Collections.unmodifiableList(list));
        return list;
    }
}
