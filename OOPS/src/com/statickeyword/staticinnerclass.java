package com.statickeyword;

public class staticinnerclass {
     static class Test{
         static String name;
         public Test(String name){
             this.name = name;
         }
         void display(){
             System.out.println("Hello");
         }
    }

    public static void main(String[] args) {
        Test a = new Test("a");
        Test b = new Test("b");

        a.display();

        System.out.println(a.name);
        System.out.println(b.name);

    }
}
class A{
    String name;

    public A(String name){
        this.name = name;
    }
}
