package com.ObjectsComparing;

public class Student implements Comparable<Student>{
    int rollno;
    float marks;

    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return rollno + " " + marks;
    }

    @Override
    public int compareTo(Student o) {
        System.out.println("In compareto");
        int diff = (int)(this.marks - o.marks);
        return diff;
    }
}
