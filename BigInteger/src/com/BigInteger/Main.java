package com.BigInteger;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        int a = 100;
        int b = 27;

        //copying a int val
        BigInteger A = BigInteger.valueOf(a);
        //normal value
        BigInteger B = BigInteger.valueOf(33);
        //string
        BigInteger C = BigInteger.valueOf(Long.parseLong("43756946"));
        BigInteger c = new BigInteger("2345678765347");
        //constants
        BigInteger D = BigInteger.ONE;

        //convert biginteger to int
        int i = B.intValue();


        System.out.println(A + " " + B + " " + C + " " + c + " " + D);

        //addition
        BigInteger addition = A.add(B);
        System.out.println(addition);

        //substraction
        BigInteger subtraction = A.subtract(B);
        System.out.println(subtraction);

        //multiplication
        BigInteger multiplication = A.multiply(B);
        System.out.println(multiplication);

        //dividion
        BigInteger division = A.divide(B);
        System.out.println(division);

        //remainder
        BigInteger remainder = A.remainder(B);
        System.out.println(remainder);

        System.out.println(factorial(26));

    }
    static BigInteger factorial(int n) {
        BigInteger ans = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            ans = ans.multiply(BigInteger.valueOf(i));
        }
        return ans;
    }
}