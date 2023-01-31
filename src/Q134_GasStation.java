public class Q134_GasStation {
    public static void main(String[] args) {
        int[] gas = {1,2,3,4,5};
        int[] costs = {3,4,5,1,2};
        System.out.println(canCompleteCircuit(gas, costs));
    }

    private static int canCompleteCircuit(int[] gas, int[] costs) {
        int totalCost = 0, totalGas = 0, start = 0;

        for(int i : gas) totalGas+=i;
        for(int i : costs) totalCost+=i;

        if(totalCost > totalGas) return -1;

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < gas.length; i++) {
            if(gas[i] - costs[i] >= 0) {
                if(gas[i] - costs[i] > max){
                    max = gas[i] - costs[i];
                    start = i;
                }
            }
        }
        return start;
    }
}
