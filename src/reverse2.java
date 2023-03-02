import javax.print.DocFlavor;

public class reverse2 {
    public static void main(String[] args) {
        String str ="how are you";
        char[] chararray= str.toCharArray();
        int left=0,right=str.length()-1;
        while(left <right){
            char temp =chararray[left];
            chararray[left]=chararray[right];
            chararray[right]=temp;
            left++;
            right--;
        }
        String revstr =new String(chararray);
        System.out.println(revstr);
    }
}
