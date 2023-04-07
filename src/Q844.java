import java.util.Objects;

public class Q844 {
    public static void main(String[] args) {
        System.out.println(backspaceCompare("xywrrmp","xywrrmu#p"));
    }
    public static boolean backspaceCompare(String s, String t) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        int i = 0;
        while (i < s.length() || i < t.length()) {
            if (i < s.length()) {
                if (s.charAt(i) == '#'){
                    if (sb1.length()-1 >= 0){
                        sb1.setLength(sb1.length()-1);
                    }
                    else {
                        sb1 = new StringBuilder();
                    }
                }
                else {
                    sb1.append(s.charAt(i));
                }
            }
            if (i < t.length()) {
                if (t.charAt(i) == '#'){
                    if (sb2.length()-1 >= 0){
                        sb2.setLength(sb2.length()-1);
                    }
                    else {
                        sb2 = new StringBuilder();
                    }
                }
                else {
                    sb2.append(t.charAt(i));
                }
            }
            i++;
        }
        System.out.println(sb1);
        System.out.println(sb2);
        return sb1.toString().equals(sb2.toString());
    }
}
