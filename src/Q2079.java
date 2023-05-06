public class Q2079 {
    public static void main(String[] args) {
        System.out.println(wateringPlants(new int[]{3,2,4,2,1}, 6));
    }

    private static int wateringPlants(int[] nums, int k) {
        int steps = 0, capacity = k;

        for (int i = 0; i < nums.length; i++) {
            if (capacity >= nums[i]) {
                capacity -= nums[i];
                steps++;
            }
            else {
                steps += (i * 2) + 1;
                capacity = k;
                capacity -= nums[i];
            }
        }
        return steps;
    }
}
