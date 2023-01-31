import java.util.HashMap;

public class Q2465_NumberofDistinctAverages {
    public static void main(String[] args) {
        int nums[] = {0,0,7,2};
        System.out.println(distinctAverages(nums));
    }

    private static int distinctAverages(int[] nums) {
        int max = 0;
        for(int i : nums) max = Math.max(max,i);
        int[] freq = new int[max+1];
        for(int i : nums) freq[i]++;

        int start = 0, end = freq.length-1;
        HashMap<Double,Integer> map = new HashMap<>();

        while(start <= end){
            if(freq[start] > 0 && freq[end] > 0){
                double temp =(float)  (start + end) / 2;
                map.put(temp,map.getOrDefault(temp,0)+1);

                if(freq[end] == 0 && freq[start] == 0){
                    start++;
                    end--;
                }
                if(freq[start] > 0) freq[start]--;
                if (freq[end] > 0) freq[end]--;
            }
            else if(freq[start] == 0) start++;
            else if(freq[end] == 0) end--;
            else {
                start++;
                end--;
            }
        }
        int ans = 0 ;
        for(int i : map.values()) {
            ans++;
        }
        System.out.println(map);
        return ans;
    }


}
