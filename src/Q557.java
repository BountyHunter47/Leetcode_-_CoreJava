public class Q557 {
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }
    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] tmp =  s.split(" ") ;

        for (int i = 0; i < tmp.length; i++) {
            StringBuilder tmpString = new StringBuilder(tmp[i]);
            sb.append(tmpString.reverse());
            if (i == tmp.length-1) break;
            sb.append(" ");
        }

        return sb.toString();
    }
}
