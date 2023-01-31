import java.util.ArrayList;

public class Q1534_CountGoodTriplets {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);

        if (list.contains(2)) System.out.println("contains");
        int[] arr = {7,3,7,3,12,1,12,2,3};
//        System.out.println(countGoodTriplets(arr,5,8,1));
    }

    private static int countGoodTriplets(int[] arr, int a, int b, int c) {
        int ans = 0;
        for(int i = 0; i < arr.length-3; i++){
            for(int j = i+1; i < arr.length-2; j++){
                for(int k = j+1; i < arr.length; k++){
                    if(Math.abs(arr[i] - arr[j]) <= a && Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c  ) ans++;
                }
            }
        }
        return ans;
    }
}
