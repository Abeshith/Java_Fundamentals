package com.statickeyword;

public class staticmethod {
    public static void main(String[] args) {
        //cant access a non-static method inside a static
        //bcz its depend on a instance of a class or object
        //greet();

        //static method can be accessed inside a static method bcz it doesnt depend on object
        greeting();

        staticmethod method = new staticmethod();
        method.fun();


        hello hel = new hello(23,56);
        System.out.println(hel.age);
        System.out.println(hel.num);


    }

    static void greeting(){
        //we create instance of the main in the static context
        staticmethod obj = new staticmethod();
        obj.greet();
    }
    void fun(){
        //we can access non static inside a on static method
        greet();
    }
     void greet(){
        System.out.println("Hello World");
    }
}
class hello{
    int age;
    int num;

    static void messgae(){
        System.out.println("Hello World");
        //we cant access this in the static because it's pointing towards to object refrenece
        //System.out.println(this.age);
    }

    hello(int age, int num){
        this.age = age;
        this.num = num;

        hello.messgae();
    }
}
