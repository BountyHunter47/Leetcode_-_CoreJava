public class Q1869 {
    public static void main(String[] args) {
        System.out.println(checkZeroOnes("111000"));
    }

    private static boolean checkZeroOnes(String s) {
        int one = 0, zero = 0;

        int tmpOne = 0, tmpZero = 0;
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '1'){
                tmpZero = 0;
                tmpOne++;
                one = Math.max(one, tmpOne);
            }
            else {
                tmpOne = 0;
                tmpZero++;
                zero = Math.max(zero, tmpZero);
            }
        }

        return one > zero;
    }

}
