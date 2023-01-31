import java.util.HashSet;
import java.util.PriorityQueue;

public class Q2336_SmallestNumberinInfiniteSet {
    public static void main(String[] args) {
        Q2336_SmallestNumberinInfiniteSet call = new Q2336_SmallestNumberinInfiniteSet();
        SmallestInfiniteSet get = call.new SmallestInfiniteSet();

        System.out.println(get.addBack(2));
        System.out.println(get.popSmallest());
        System.out.println(get.popSmallest());
        System.out.println(get.popSmallest());
        System.out.println(get.addBack(1));
        System.out.println(get.popSmallest());
        System.out.println(get.popSmallest());
        System.out.println(get.popSmallest());

    }

    class SmallestInfiniteSet {
        HashSet<Integer> set;
        PriorityQueue<Integer> pq;
        int temp = 1;

        public SmallestInfiniteSet() {
            set = new HashSet<>();
            pq = new PriorityQueue<>();
            while(temp < 1002){
                set.add(temp);
                pq.offer(temp);
                temp++;
            }
        }

        public int popSmallest() {
            int temp = pq.poll();
            set.remove(temp);
            return temp;
        }

        public String addBack(int num) {
            if(!set.contains(num)) {
                set.add(num);
                pq.offer(num);
            }
            return null;
        }
    }

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */

}
