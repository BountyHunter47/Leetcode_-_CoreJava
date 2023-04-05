public class Q1812 {
    public static void main(String[] args) {
        System.out.println(squareIsWhite("a1"));
    }
    public static boolean squareIsWhite(String coordinates) {
        char ch = coordinates.charAt(0);
        int num =Integer.valueOf(String.valueOf(coordinates.charAt(1)));
        if (ch % 2 != 0 && num % 2 != 0) return true;
        if (ch % 2 != 0 && num % 2 == 0) return false;
        if (ch % 2 == 0 && num % 2 != 0) return false;
        return true;
    }
}
