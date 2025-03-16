package com.Stringbuffer;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //constructor 1
        StringBuffer sb = new StringBuffer();
        sb.append("Hello World!");
//        System.out.println(sb);
//        String str = sb.toString();
//        System.out.println(str);

        //Constructor 2
        StringBuffer sb1 = new StringBuffer("Hello World!");

        //Constructor 3
        StringBuffer sb2 = new StringBuffer(30);

        //Methods
        sb.append("Hello Worlds!"); // Not gonna create new object just modify it only
        System.out.println(sb.toString());

        sb.insert(2," Macha ");
        sb.insert(2,"y");
        System.out.println(sb.toString());

        sb.replace(9,19," Vanakkam ");
        System.out.println(sb.toString());

        sb.delete(20,36);
        System.out.println(sb.toString());

        sb.reverse();
        System.out.println(sb.toString());

        String str = "apple, banana, grapes";
        System.out.println(Arrays.toString(str.split("\\,")));

        ArrayList<Number> list = new ArrayList<>();
        list.add(1);
        list.add(1.1);

    }
}