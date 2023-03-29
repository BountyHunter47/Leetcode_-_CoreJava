public class Q1629 {
    public static void main(String[] args) {
        System.out.println(slowestKey(new int[]{1,2},"ba"));
    }
    public static char slowestKey(int[] releaseTimes, String keysPressed) {
        int tmp = 0;
        int checker = Integer.MIN_VALUE;
        char ans = 'x';

        for (int i = 0; i < releaseTimes.length; i++) {
            if (Math.abs(releaseTimes[i] - tmp) >= checker) {
                if (Math.abs(releaseTimes[i] - tmp) == checker) {
                    ans = (char) Math.max(ans, keysPressed.charAt(i));
                }else{
                    ans = keysPressed.charAt(i);
                }
                checker = releaseTimes[i] - tmp;
            }
            tmp = releaseTimes[i];
        }

        return ans;
    }
}
