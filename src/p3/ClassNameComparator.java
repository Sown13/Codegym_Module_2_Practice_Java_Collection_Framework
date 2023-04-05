package p3;

import java.util.Comparator;

public class ClassNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return (o1.getClassName().split(""))[1].compareTo((o2.getClassName().split(""))[1]);
    }
}
