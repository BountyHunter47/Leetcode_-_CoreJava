public class Q2525 {
    public static void main(String[] args) {
        System.out.println(categorizeBox(2909, 3968, 3272, 727));
    }

    private static String categorizeBox(int length, int width, int height, int mass) {
        boolean bulky = false, heavy = false;
        long tmp = (long) length * height * width;

        if (length >= Math.pow(10,4) || height >= Math.pow(10,4) || width >= Math.pow(10,4) || (tmp) >= Math.pow(10, 9)) bulky = true;
        if (mass >= 100) heavy = true;

        if (bulky && heavy) return "Both";
        if (!bulky && !heavy) return "Neither";

        if (bulky) return "Bulky";

        return "Heavy";
    }
}
