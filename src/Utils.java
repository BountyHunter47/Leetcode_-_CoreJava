public class Utils {
    public static int[] loweCaseFreq(char[] nums) {
        int[] freq = new int[26];
        for (char ch : nums) freq[ch - 'a']++;
        return freq;
    }
    public static int[] loweCaseFreq(String s) {
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) freq[ch - 'a']++;
        return freq;
    }
    public static int[] upperCaseFreq(char[] nums) {
        int[] freq = new int[128];
        for (char ch : nums) freq[ch]++;
        return freq;
    }
    public static int[] upperCaseFreq(String s) {
        int[] freq = new int[128];
        for (char ch : s.toCharArray()) freq[ch]++;
        return freq;
    }
    public static boolean isVowel(char ch) {
        return (ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'O' || ch == 'I' || ch == 'U');
    }
    public static void swapInt(int[] nums, int i, int j) {
        try {
            int tmp = nums[j];
            nums[j] = nums[i];
            nums[i] = tmp;
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bound");
        }
    }
    public static void swapChar(char[] arr, int i, int j) {
        try {
            char tmp = arr[j];
            arr[j] = arr[i];
            arr[i] = tmp;
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bound");
        }
    }

}
