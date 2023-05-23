public class Q2698 {
    public static void main(String[] args) {
        System.out.println(punishmentNumber(10));
    }

    private static int punishmentNumber(int n) {
        int sum = 0;
        for (int i = 36; i <= n; i++) {
            String str = (i * i) + "";
            if (Possible(str,0,i,0))  sum += (i *i);
        }
        return sum;
    }

    public static boolean Possible(String str,int i,int target,int curSum){
        if(i==str.length()){
            return target==curSum;
        }
        for(int j=i;j<str.length();j++){
            int curNum=Integer.parseInt(str.substring(i,j+1));
            if(Possible(str,j+1,target,curSum+curNum)){
                return true;
            }
        }
        return false;
    }
}
