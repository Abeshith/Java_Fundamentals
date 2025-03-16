package com.Interfaces.NestedInterface;

public class Nested {
    public interface NestedInterface {
        boolean isOdd(int num);
    }
}
class OddChecker implements Nested.NestedInterface {
    @Override
    public boolean isOdd(int num) {
        return (num % 2) == 1;
    }
}
class Main{
    public static void main(String[] args) {
        Nested.NestedInterface obj = new OddChecker();
        OddChecker obj2 = new OddChecker();

        System.out.println(obj.isOdd(13));

    }
}
