public class reverse {
    public static void main(String[] args) {
        String a="123456";
        char arr[]=a.toCharArray();
        arr[2]='p';

        int left=0;
        int right= arr.length-1;

        while (left < right){
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}

