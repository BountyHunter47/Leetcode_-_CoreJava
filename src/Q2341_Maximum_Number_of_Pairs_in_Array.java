import java.util.Arrays;
import java.util.HashSet;

public class Q2341_Maximum_Number_of_Pairs_in_Array {
    public static void main(String[] args) {
        int[] nums = {1,3,2,1,3,2,2};
        System.out.println(Arrays.toString(numberOfPairs(nums)));
    }

    //sarkhi pair remove karti javani
    // ketli pair remove thy eno total and pasi last vadhe e
    //reminder return karavanu
    private static int[] numberOfPairs(int[] nums) {
//        Arrays.sort(nums);
        int[] ans = new int[2];

        HashSet<Integer> set = new HashSet<>();
        int c=0;
        for (int i:nums)
        {
            if (set.contains(i))
                // first value jashe and agal check karshe jo ene evi same value malshe to e if ni under jashe
            {
                set.remove(i);
                c++;
            }
            else {
                set.add(i);
            }
        }
        ans[0]=c;
        ans[1]= set.size();
        return ans;
    }
}
