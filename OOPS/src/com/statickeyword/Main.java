package com.statickeyword;

public class Main {
    public static void main(String[] args) {
        Human abe = new Human(21,150000,"Abe",true);
        Human abe2 = new Human(21,150000,"Abe2",false);

        System.out.println(abe.name);

        System.out.println(abe.population);
        System.out.println(abe2.population);
    }

}
