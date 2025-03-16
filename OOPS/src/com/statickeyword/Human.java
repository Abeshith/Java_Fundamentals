package com.statickeyword;

public class Human {
    int age;
    int salary;
    String name;
    boolean married;
    static long population;

    public Human(int age, int salary, String name, boolean married) {
        this.age = age;
        this.salary = salary;
        this.name = name;
        this.married = married;
        Human.population += 1;
    }

}
