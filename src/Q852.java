public class Q852 {
    public static void main(String[] args) {
        System.out.println(peakIndexInMountainArray(new int[] {3,4,5,1}));
    }

    private static int peakIndexInMountainArray(int[] arr) {
        int left =0, right = arr.length -1;

        while (left <= right) {
            int mid = left + (right -left) /2;
            if (arr[mid] > arr[mid+1] && arr[mid] > arr[mid -1]) return mid;
            else if (arr[mid] > arr[mid +1]) right = mid;
            else left = mid;
        }
        return -1;
    }
}
