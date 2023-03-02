public class palidrome {
    public static void main(String[] args) {
        String str="madam";
        int left=0,right=str.length()-1;
        while(left<right){
            if(str.charAt(left) != str .charAt(right)){
                System.out.println("not palidrome");
                return;
            }
            left++;
            right--;
        }
        System.out.println("palidrome");
    }
}
