public class GCD {
    public static void main(String[] args) {
        int x = 60, y = 50;
        System.out.println(gcd(Math.max(x, y), Math.min(y, x)));
    }

    private static int gcd(int x, int y) {
        if (y == 0) return x;
        return gcd(y,x % y);
    }
}
