import java.util.Arrays;

public class _7 {
    public static void main(String[] args) {
        System.out.println(sortString("jevinsondagar"));
    }

    private static String sortString(String s) {
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    char tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println(arr);
        return Arrays.toString(arr);
    }
}
