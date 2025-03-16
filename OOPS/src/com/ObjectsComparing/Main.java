package com.ObjectsComparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student kunal = new Student(33,99.9f);
        Student abe = new Student(23,97.9f);
        Student karan = new Student(22,99.9f);
        Student pusha = new Student(26,97.9f);
        Student sam = new Student(27,99.9f);

        Student[] array = {kunal,abe,karan,pusha,sam};

        System.out.println("using comaparable interface");
        // sorted  based on marks
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));


        System.out.println();
        System.out.println("Using comapartor class");
        //can also do something like this using comparator class instead of comaprator class
        System.out.println(Arrays.toString(array));
        Arrays.sort(array,  new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                return (int)(o1.rollno - o2.rollno);
            }
        });
        System.out.println(Arrays.toString(array));

        System.out.println();

        if(kunal.compareTo(abe) > 0){
            System.out.println("Kunal is greater than abe");
        }
    }
}
