public class Q2511_MaximumEnemyFortsThatCanBeCaptured {
    public static void main(String[] args) {
        int forts[] = {-1,-1,0,1,0,0,1,-1,1,0};
        System.out.println(captureForts(forts));
    }

    private static int captureForts(int[] forts) {
            int start = 0, end = forts.length-1, capt = 0;
            int count1 = 0, count2 = 0;
            boolean flag1 = false, flag2 = false;

            int temp1 = 0;
            while (end >= 0) {
                if(forts[end] == 1) {
                    flag1 = true;
                }
                if (flag1){
                    if(forts[end] == 1) temp1 = 0;
                    if (forts[end] == 0) {
                        temp1++;
                    }
                    if(forts[end] == -1){
                        count1 = Math.max(temp1,count1);
                        temp1 = 0;
                        flag1 = false;
                    }
                }
                end--;
            }

               int temp2 = 0;
               while ( start < forts.length) {
                   if(forts[start] == 1) {
                       flag2 = true;
                   }
                   if (flag2){
                        if(forts[start] == 1) temp2 = 0;
                       if (forts[start] == 0) {
                           temp2++;
                       }
                       if(forts[start] == -1){
                           count2 = Math.max(temp2,count2);
                           temp2 = 0;
                           flag2 = false;
                       }
                   }
                   start++;
                }
           return Math.max(count2,count1);
    }
}
