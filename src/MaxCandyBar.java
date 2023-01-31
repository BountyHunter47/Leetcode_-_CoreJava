public class MaxCandyBar {
    public static void main(String[] args) {
        int[] costs = {4,7,6,4,4,2,2,4,8,8};

        System.out.println(getMax(costs,41));
    }

    static int getMax(int[]costs,int coins){
        int count = 0;
        int max = 0;

        for(int i : costs) max = Math.max(max,i);
        int[] freq = new int[max+1];

        for(int i : costs) freq[i]++;
        for(int i = 1; i < freq.length; i++){
            if(freq[i] == 0) continue;
            if(i > coins) break;

            int temp = Math.min(freq[i], coins/i);
            coins -= (temp*i);
            count+=temp;
        }
        System.out.println("Coins -> "+coins);
        return count;

//        int maxCost = 0;
//
//        for (int cost : costs) {
//            if (cost > maxCost) {
//                maxCost = cost;
//            }
//        }
//
//        int[] numOfCosts = new int[maxCost + 1];
//
//        for (int cost : costs) {
//            numOfCosts[cost]++;
//        }
//
//        int iceCreamBars = 0;
//
//        for (int cost = 1; cost <= maxCost; cost++) {
//            if (numOfCosts[cost] == 0) {
//                continue;
//            }
//
//            if (coins < cost) {
//                break;
//            }
//
//            int count = Math.min(numOfCosts[cost], coins / cost);
//            coins -= count * cost;
//            iceCreamBars += count;
//        }
//
//        return iceCreamBars;
    }
}
