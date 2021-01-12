package com.mendes;

import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        TreeMap<Student, String> treeMap = new TreeMap<Student, String>();
        Student ali = new Student(12, "Ali");
        Student murat = new Student(40, "Murat");
        Student can = new Student(20, "Can");
        Student canan = new Student(25, "Canan");
        Student nazli = new Student(10, "Nazlı");

        treeMap.put(ali, "Adana");
        treeMap.put(murat, "Istanbul");
        treeMap.put(can, "Bursa");
        treeMap.put(canan, "Van");
        treeMap.put(nazli, "Mersin");

        System.out.println(treeMap);
        System.out.println(treeMap.lowerKey(canan));
        System.out.println(treeMap.containsValue("Ankara"));
        System.out.println(treeMap.firstEntry());
        System.out.println(treeMap.higherEntry(ali));
        System.out.println(treeMap.lastEntry());
        System.out.println(treeMap.size());
        System.out.println(treeMap.subMap(ali, murat));
    }
}

class Student implements Comparable<Student> {

    private int schoolNo;
    private String name;

    public Student(int schoolNo, String name) {
        this.schoolNo = schoolNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "schoolNo=" + schoolNo +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        if (this.schoolNo < student.schoolNo) {
            return -1;
        } else if (this.schoolNo > student.schoolNo) {
            return 1;
        } else
            return 0;
    }
    /*
    //sort by big number
    @Override
    public int compareTo(Student student) {
        if (this.schoolNo > student.schoolNo) {
            return -1;
        } else if (this.schoolNo < student.schoolNo) {
            return 1;
        } else
            return 0;
    }
    */
}