import java.util.HashMap;
import java.util.Map;

public class Q1742 {
    public static void main(String[] args) {
        System.out.println(countBalls(5,15));
    }
    public static int countBalls(int lowLimit, int highLimit) {
            Map<Integer,Integer> map = new HashMap<>();

            for(int i = lowLimit; i <= highLimit; i++) {
                if (i < 10) map.put(i, map.getOrDefault(i,0)+1);
                else {
                    var tmp = i; var sum = 0;
                    while(tmp != 0){
                        var tmp2 = tmp % 10;
                        sum += tmp2;
                        tmp /= 10;
                    }
                    map.put(sum, map.getOrDefault(sum,0)+1);
                }
            }
            var ans = 0;
            var finalAnswer = 0;
            for (int i : map.keySet()){
                if (map.get(i) > ans){
                    finalAnswer = map.get(i);
                    ans = map.get(i);
                }
            }
            return finalAnswer;
    }
}
