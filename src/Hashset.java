import java.util.HashSet;
import java.util.Objects;

public class Hashset {
    public static void main(String[] args) {
        Stud s1 = new Stud("akash",02);
        Stud s2 = new Stud("akash",02);
        Stud s3 = new Stud("jevin",02);

        HashSet<Stud> set  =new HashSet<>();
        set.add(s2);
        set.add(s3);
        set.add(s1);
        System.out.println(set);
    }
}

class Stud{
    String name;
    int rno;

    public Stud(String name, int rno) {
        this.name = name;
        this.rno = rno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stud stud = (Stud) o;
        return rno == stud.rno && Objects.equals(name, stud.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rno);
    }

    @Override
    public String toString() {
        return "Stud{" +
                "name='" + name + '\'' +
                ", rno=" + rno +
                '}';
    }
}