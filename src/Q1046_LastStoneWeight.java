import java.util.Collections;
import java.util.PriorityQueue;

public class Q1046_LastStoneWeight {
    public static void main(String[] args) {
        int[] stones = {1};
        System.out.println(lastStoneWeight(stones));
    }

    private static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : stones) pq.offer(i);
        while(!pq.isEmpty()){
            int temp1 = pq.poll();
            if(pq.isEmpty()) return temp1;
            int temp2 = pq.poll();
            if(pq.isEmpty()) return Math.abs(temp1-temp2);
            if(temp1 != temp2) pq.offer(Math.abs(temp1-temp2));
        }
        return 0;
    }
}
