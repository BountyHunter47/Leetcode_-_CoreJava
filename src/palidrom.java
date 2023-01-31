public class palidrom
{
    public static void main(String[] args) {
        String a="adda";
        int left=0;
        int right=a.length()-1;
        for(int i=0; i<a.length(); i++)
        {
            if(a.charAt(left)!=a.charAt(right))
            {
                System.out.println("not palidron");
                return;
            }
            left++;
            right--;
        }
        System.out.println("palidrom");

    }
}
