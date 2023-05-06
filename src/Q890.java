import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q890 {
    public static void main(String[] args) {
        System.out.println(findAndReplacePattern(new String[] {"abc","deq","mee","aqq","dkd","ccc"}, "abb"));
    }

    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> al=new ArrayList<>();
        for(String word:words){
            if(check(word,pattern)) al.add(word);
        }
        return al;
    }
    static boolean check(String s1, String s2){
        for(int i=0;i<s1.length();i++){
            int check = s1.indexOf(s1.charAt(i));
            int tmp = s2.indexOf(s2.charAt(i));
            if(check != tmp){
                return false;
            }
        }
        return true;
    }
}
