import java.util.Arrays;
import java.util.Scanner;

public class Oops_Assignment_2 {

    public static void main(String[] args) {
        Std s1 = new Std();
        Std s2 = new Std();
        s2.setDeatil();
        s2.showDetail();
        s2.totalMarks();
        s2.Average();
        s2.highestMarks();
        s2.lowestMarks();
        s2.getPassCount();
        Std.totalStudent();

    }
}

class Std {
    Std(){
        count++;
        rollNo = count;
    }
    static int count = 0;
    int rollNo;
    String name = null;
    int[] marks = new int[5];
    Scanner sc = new Scanner(System.in);
    void showDetail(){
        System.out.println("Name = " + name);
        System.out.println("Roll No = " + rollNo);
            int idx = 1;
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Sub "+ idx++ +" = "+marks[i]);
        }
    }
    static void totalStudent(){
        System.out.println("Total Student is : " + count);
    }
    int total = 0;
    void totalMarks(){
        for(int i : marks) total += i;
        System.out.println("Total Marks is : "+ total);
    }
    void setDeatil(){
        System.out.println("Enter Your Name : ");
        name = sc.nextLine();
        int count = 1;
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter Sub" + count + " Marks : ");
            marks[i] = sc.nextInt();
        }
    }
    void highestMarks(){
        Arrays.sort(marks);
        System.out.println("Highest Marks is : " + marks[marks.length-1]);
    }
    void lowestMarks(){
        Arrays.sort(marks);
        System.out.println("Lowest Marks is : " + marks[0]);
    }
    void Average(){
        System.out.println("Average Marks is : " + (float) total/marks.length);
    }
    void getPassCount(){
        int count =0;
        for(int i : marks){
            if(i > 50) count++;
        }
        System.out.println("Total Subject Passed is : "+count);
    }
}