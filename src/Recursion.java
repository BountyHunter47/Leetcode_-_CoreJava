import java.util.ArrayList;
import java.util.List;

public class Recursion {
    public static void main(String[] args) {
//        System.out.println(sumOfN(5, 0));

//        System.out.println(sumOfNWithNoParameters(5));

//        System.out.println(factorialOfN(5));

//        int nums[] = {1,2,3,4,5,6};
//        System.out.println(Arrays.toString(reversedArray(nums, 0)));

//        System.out.println(checkStringPalindrome("mabm", 0));

//        System.out.println(getFibonacci(12));
        Recursion obj = new Recursion();
        obj.getSubsequence(new int[] {3,1,2},0, new ArrayList<>());
        System.out.println(obj.ans);
    }
    List<List<Integer>> ans = new ArrayList<>();

    private void getSubsequence(int[] nums, int i, ArrayList<Integer> list) {
        if (i >= nums.length) {
            if (!list.isEmpty())ans.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[i]);
        getSubsequence(nums,i+1, list);
        list.remove(list.size()-1);
        getSubsequence(nums,i+1, list);
    }

    private static int getFibonacci(int n) {
        if (n <= 1) return n;
        return getFibonacci(n-1) + getFibonacci(n-2);
    }

    private static boolean checkStringPalindrome(String s, int i) {
        if (i >= s.length() / 2) return true;
        if (s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
        return checkStringPalindrome(s, i +1);
    }

    private static int[] reversedArray(int[] nums, int left) {
        if (left >= nums.length / 2) return nums;
        int tmp = nums[left];
        nums[left] = nums[nums.length - left - 1];
        nums[nums.length - left - 1] = tmp;
        return reversedArray(nums, left+1);
    }

    private static int factorialOfN(int n) {
        if (n <= 1) return 1;
        return n * factorialOfN(n-1);
    }


    //Without parameterized
    private static int sumOfNWithNoParameters(int n) {
        if (n <= 1) return n;
        return n + sumOfNWithNoParameters(n-1);
    }

    //Parametarized
    private static int sumOfN(int n, int sum) {
        if (n < 1) return sum;
        return sumOfN(n-1, sum + n);
    }


}
