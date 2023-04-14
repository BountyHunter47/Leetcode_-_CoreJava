public class Q2269 {
    public static void main(String[] args) {
        System.out.println(divisorSubstring(430043, 2));
    }

    private static int divisorSubstring(int num, int k) {
        String str = String.valueOf(num);
        int count = 0;

        for (int i = 0; i <= str.length()-k; i++) {
            int tmp = Integer.parseInt(str.substring(i, i+k));
            if (tmp != 0 && num % tmp == 0) count++;
        }

        return count;
    }
}
