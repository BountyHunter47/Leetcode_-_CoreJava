public class _1 {
    public static void main(String[] args) {
        System.out.println(stringReverse("hello world"));
    }

    private static String stringReverse(String s) {

        char[] arr = new char[s.length()];

        for (int i = 0; i < s.length(); i++) arr[i] = s.charAt(i);

        System.out.println(arr);

        int left = 0, right = arr.length-1;
        while (left < right) {
            char tmp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = tmp;
        }

        System.out.println(arr);

        return new String(arr);
    }

}
