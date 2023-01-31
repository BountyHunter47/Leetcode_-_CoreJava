public class Q1539_KthMissingPositiveNumber {
    public static void main(String[] args) {
        int[] arr = {1,2};
        int k = 1;
        System.out.println(findKthPositive(arr,k));
    }

    private static int findKthPositive(int[] arr, int k) {
        int[] freq = new int[1001];
        freq[0] = Integer.MAX_VALUE;
        for(int i : arr) freq[i]++;

        int idx = 0,temp = 1;
        while(true){
            if(freq[temp] == 0) idx++;
            if(idx == k) return temp;
            temp++;
        }
    }
}
