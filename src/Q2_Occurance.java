import java.util.HashMap;
import java.util.HashSet;
public class Q2_Occurance {
    public static void main(String[] args) {
        int[] nums = {2,2};
        System.out.println(checkOccurance(nums));
    }

    public static boolean checkOccurance(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i : nums)map.put(i,map.getOrDefault(i,0)+1);
        HashSet<Integer> set = new HashSet<>(map.values());
        return map.size()==set.size();
    }
}