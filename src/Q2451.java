import java.util.*;

public class Q2451 {
    public static void main(String[] args) {
        System.out.println(oddString(new String[]{"adc","wzy","abc"}));
    }
    public static String oddString(String[] words) {
        List<List<Integer>> list = new ArrayList<>();
        Set<List<Integer>> same = new HashSet<>();
        Set<List<Integer>> odd = new HashSet<>();

        for (String str : words) {
            List<Integer> tmp = new ArrayList<>();
            for (int i = 1; i < str.length(); i++) {
                tmp.add((str.charAt(i)-'a') - (str.charAt(i-1)-'a'));
            }
            list.add(tmp);

        }

        for (int i = 0; i < list.size(); i++) {
            if (odd.contains(list.get(i))) {
                odd.remove(list.get(i));
                same.add(list.get(i));
            }
            else if (!same.contains(list.get(i))) {
                odd.add(list.get(i));
            }
        }
        for (List<Integer> i : list) {
            if (odd.contains(i)) return words[list.indexOf(i)];
        }
        System.out.println(odd);

        System.out.println(list);
        return "";
    }
}
