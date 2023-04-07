public class Q2042 {
    public static void main(String[] args) {
        System.out.println(areNumbersAscending("1 box has 3 blue 4 red 6 green and 12 yellow marbles"));
    }

    public static boolean areNumbersAscending(String s) {
        String[] strings = s.split(" ");

        int checker = Integer.MIN_VALUE;
        for (String str : strings) {
            if (str.charAt(0) >= '0' && str.charAt(0) <= '9') {
                int tmp = Integer.parseInt(str);
                if (tmp > checker) checker = tmp;
                else return false;
            }
        }

        return true;
    }
}
