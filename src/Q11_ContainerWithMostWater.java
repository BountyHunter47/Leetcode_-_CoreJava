public class Q11_ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

    private static int maxArea(int[] height) {
        int ans = 0, start = 0, end = height.length-1;

        while(start < end){
            int temp = Math.min(height[start], height[end]);
            ans = Math.max(ans,(end-start)*temp);
            if(height[start] < height[end]) start++;
            else if (height[start] > height[end]) end--;
            else {
                start++;
                end--;
            }
        }
        return ans;
    }
}
