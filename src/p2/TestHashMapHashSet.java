package p2;

import java.util.HashMap;
import java.util.HashSet;

public class TestHashMapHashSet {
    public static void main(String[] args) {
        HashMap<Integer,Student> hashMapStudentList = new HashMap<>();
        hashMapStudentList.put(1,new Student("Son",29,"g1"));
        hashMapStudentList.put(2,new Student("Giang",39,"g2"));
        hashMapStudentList.put(3,new Student("Nam",49,"g1"));
        System.out.println(hashMapStudentList);

        HashSet<Student> hashSetStudentList = new HashSet<>();
        hashSetStudentList.add(new Student("Son",29,"g1"));
        hashSetStudentList.add(new Student("Nam",39,"g1"));
        hashSetStudentList.add(new Student("Nam",49,"g1"));
        hashSetStudentList.add(new Student("Nam",49,"g1"));
        hashSetStudentList.add(new Student("Giang",39,"g2"));
        hashSetStudentList.add(new Student("Giang",49,"g2"));
        Student giang1 = new Student("Giang",39,"g2");
        hashSetStudentList.add(giang1);
        hashSetStudentList.add(giang1);
        Student nam1 = new Student("Nam",49,"g1");
        hashSetStudentList.add(new Student("Son",29,"g1"));
        System.out.println(hashSetStudentList);
        System.out.println("Cannot add giang1 more than 1 time since element in HashSet is unique (in case of object, it about unique refrence)");
        System.out.println("New element (object) added follow a tree order");

    }
}
