package com.company;

public class Main {

    public static void main(String[] args) {

        //String Compare
        String S1 = "Hello ";
        String S2 = new String();
        S2 = S1;
        String S3 = new String(S2);
        String S4 = new String("hello");
        String S5 = "World";
        String S6 = new String("Hello World");
        String S7 = S1.concat(S5);
        System.out.println(S7);
    }
}
