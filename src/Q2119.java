public class Q2119 {
    public static void main(String[] args) {
        System.out.println(isSameAfterReversal(5260));
    }

    private static boolean isSameAfterReversal(int num) {
        if (num % 10 == 0) return false;
        String tmpString = String.valueOf(num);
        StringBuilder sb = new StringBuilder(tmpString);
        sb.reverse();
        int tmp = Integer.parseInt(String.valueOf(sb));
        tmpString = String.valueOf(tmp);
        sb = new StringBuilder(tmpString );
        sb.reverse();
        tmp = Integer.parseInt(String.valueOf(sb));

        return tmp == num;
    }
}
