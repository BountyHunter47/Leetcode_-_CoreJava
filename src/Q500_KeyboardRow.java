import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q500_KeyboardRow {
    public static void main(String[] args) {
        String[] words = {"Hello","Alaska","Dad","Peace"};
        System.out.println(Arrays.toString(getTheString(words)));
    }

    private static String[] getTheString(String[] words) {
        List<Character> row1 = new ArrayList<>();
        List<Character> row2 = new ArrayList<>();
        List<Character> row3 = new ArrayList<>();

        String s1 = "qwertyuiopQWERTYUIOP";
        String s2 = "asdfghjklASDFGHJKL";
        String s3 = "zxcvbnmZXCVBNM";

        for(char ch : s1.toCharArray()) row1.add(ch);
        for(char ch : s2.toCharArray()) row2.add(ch);
        for(char ch : s3.toCharArray()) row3.add(ch);



        ArrayList<String> ans = new ArrayList<>();

        for(String s : words) {
            boolean flag = true;
            char init = s.charAt(0);

            if (row1.contains(init)) {
            for (char ch : s.toCharArray())
                if (!row1.contains(ch)) {
                    flag = false;
                    break;
                }
            if (flag) ans.add(s);
        }

            if (row2.contains(init)) {
                for(char ch2 : s.toCharArray()) if(!row2.contains(Character.toLowerCase(ch2))) {
                    flag = false;
                    break;
                }
                if(flag) ans.add(s);
            }

            if (row3.contains(init)) {
                for(char ch3 : s.toCharArray()) if(!row3.contains(Character.toLowerCase(ch3))) {
                    flag = false;
                    break;
                }
                if(flag) ans.add(s);
            }

        }

        return ans.toArray(new String[0]);
    }
}
