public class Q1491_AverageExcludingMinimumandMaximumSalary {
    public static void main(String[] args) {
        int[] nums = {4000,3000,1000,2000};
        System.out.println(average(nums));
    }
    public static double average(int[] salary) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for(int i : salary){
            max = Math.max(i,max);
            min = Math.min(i,min);
            sum += i;
        }
        double ans = sum - (max + min);
        return ans/ (salary.length-2);
    }
}
