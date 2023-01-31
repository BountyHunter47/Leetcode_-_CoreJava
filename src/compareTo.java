import java.util.ArrayList;
import java.util.Collections;

public class compareTo {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student(12,"Jevin");
        Student s2 = new Student(32,"Akash");
        Student s3= new Student(100,"Akshil");
        Student s4 = new Student(56,"Mahesh");

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        Collections.sort(list);
        for(Student show : list){
            System.out.println(show);
        }
    }
}

class Student implements Comparable<Student>{

    int marks;
    String name;

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Student(int marks, String name){
        this.marks = marks;
        this.name = name;
    }
    @Override
    public int compareTo(Student student) {
        return this.marks<student.marks?1:-1;
    }
}
