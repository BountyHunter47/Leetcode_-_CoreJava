import java.util.*;

public class Q451 {
    public static void main(String[] args) {
        System.out.println(sortByFreq("abbaccc"));
    }

    private static String sortByFreq(String s) {
        int [] freq = new int[128];
        for(char ch:s.toCharArray()){
            freq[ch]++;
        }
        char[] c = new char[s.length()];
        for(int i = 0; i < s.length();){
            int max = 0;
            int index = 0;
            for(int j = 0; j < 128;j++){
                if(freq[j]>max){
                    max = freq[j];
                    index = j;
                }
            }
            while(freq[index]>0){
                c[i++] = (char)index;
                freq[index]--;
            }
        }
        return new String(c);
    }
}
