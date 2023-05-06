public class Q1689 {
    public static void main(String[] args) {
        System.out.println(minPartitions("32"));
    }

    private static int minPartitions(String s) {
        char tmp = '0';

        for (char ch : s.toCharArray()) tmp = (char) Math.max(tmp, ch);

        return tmp - '0';
    }
}
