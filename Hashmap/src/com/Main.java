package com;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
//        HashMap<Integer, String> map = new HashMap<>();
//        map.put(89, "Aberdeen");
//        map.put(22, "Berlin");
//        map.put(31, "Chicago");
//
//        System.out.println(map.get(31));
//        System.out.println(map.getOrDefault(32,"Nothing"));
//
//
//        HashSet<Integer> set = new HashSet<>();
//        set.add(56);
//        set.add(27);
//        set.add(13);
//        set.add(23);
//        set.add(99);
//        set.add(56);
//        System.out.println(set);

        CustomHashMap map = new CustomHashMap();
        map.put("Apple", "King of Fruits");
        map.put("Lion", "King of Forest");
        map.put("Pineapple", "A simple fruit");

        System.out.println(map.get("Pineapple"));
    }
}