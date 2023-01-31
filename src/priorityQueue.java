import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class priorityQueue {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        if(map.get(1) == 1){

        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(10);
        pq.add(25);
        pq.add(5);
        pq.add(1);
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
    }
}
