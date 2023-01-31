import java.util.HashMap;

public class Q2244_MinimumRoundstoCompleteAllTasks {
    public static void main(String[] args) {
        int[] tasks = {2,2,3,3,2,4,4,4,4,4};
        System.out.println(minimumRounds(tasks));
    }

    private static int minimumRounds(int[] tasks) {
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i : tasks) map.put(i,map.getOrDefault(i,0)+1);

        for(int temp : map.values()) {
//            if(map.containsKey(i)){
//                int temp = map.get(i);
                if(temp == 2 || temp == 3) {
                    count++;
//                    map.remove(i);
                } else if (temp > 3) {
                    while(temp != 2 && temp != 3){
                        count++;
                        if(temp - 3 > 1){
                            temp -= 3;
                        }
                        else if(temp - 2 > 1){
                            temp -= 2;
                        }
                        else{
                            return -1;
                        }
                    }
                    if(temp == 2 || temp == 3) count++;
                }
                else{
                    return -1;
                }
//            }
        }
        return count;
    }
}
