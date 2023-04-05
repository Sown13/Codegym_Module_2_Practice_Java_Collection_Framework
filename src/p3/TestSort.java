package p3;

import java.util.*;

public class TestSort {
    public static void main(String[] args) {
        List<Student> studentsList = new ArrayList<>();
        Student s1 = new Student("Son",15,"g1");
        Student s2= new Student("Nam", 20 ,"g2");
        Student s3 = new Student("Giang",30, "g1");
        Student s4 = new Student("Thi", 35 , "g1");
        Student s5 = new Student("Tuan",20,"g3");
        studentsList.add(s1);
        studentsList.add(s2);
        studentsList.add(s3);
        studentsList.add(s4);
        studentsList.add(s5);
        System.out.println(studentsList);
        Collections.sort(studentsList);
        System.out.println("sort by name" + studentsList);
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(studentsList,ageComparator);
        System.out.println("Sort by Age" + studentsList);
        ClassNameComparator classNameComparator = new ClassNameComparator();
        Collections.sort(studentsList,classNameComparator);
        System.out.println("Sort by class name (sort by 2nd char of class name)" + studentsList);
//        the term ? super E means "unknown type that is, or is a super class of, T", which in generics parlance means its lower bound is T.
    }



}
