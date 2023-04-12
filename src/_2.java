public class _2 {
    public static void main(String[] args) {
        System.out.println(checkStringPalindrome("naman"));
    }

    private static boolean checkStringPalindrome(String s) {
        char[] arr = s.toCharArray();

        int left = 0, right = s.length()-1;
        while (left < right) {
            if (arr[left] != arr[right]) return false;
            left++;
            right--;
        }

        return true;
    }
}
