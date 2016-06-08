package com.company;

public class Main {

    public static void main(String[] args) {

        //String Compare
        String S1 = "Helio ";
        String S2 = new String();
        S2 = S1;
        String S3 = new String("hELLo");
        String S4 = new String("hello");
        String S5 = "World";
        String S6 = new String("Hello World");
        String S7 = S1.concat(S5);
        System.out.println(S7);
        if(S1.equals("hello ")){
            System.out.println("S1(Hello) Equal to hello hai bhae...");
        }
        else{
            System.out.println("S1 Not Equal to hello");
        }
        if(S4 == "hello"){
            System.out.println("S4(Hello) Equal to hello hai bhae...");
        }
        else{
            System.out.println("S4 Not Equal to hello");
        }
        if(S3.equalsIgnoreCase(S4)){
            System.out.println("S1(Hello) Equal to S4(hello) hai bhae...");
        }
        else{
            System.out.println("S1 Not Equal to S4");
        }
        System.out.println(S1.compareTo(S7));
        if(S1.regionMatches(false,2,S2,3,1)){
            System.out.println("First Five char of s1 = to s2");
        }
        else{
            System.out.println("First Five char of s1 != to s2");
        }
        String strings[] = {"hello","helloo","world","worldd"};
        for(String string : strings){
            if(string.startsWith("he")){
                System.out.println("good");
            }

            else{
                System.out.println("not");
            }}
            //String Bulider
            StringBuilder buffer1 = new StringBuilder();
            StringBuilder buffer2 = new StringBuilder(10);
            StringBuilder buffer3 = new StringBuilder("ali");
            System.out.println(buffer2.capacity());
            buffer3.ensureCapacity(33);
            System.out.println(buffer3.capacity());
        System.out.println(buffer3.reverse());
        Character a1 = 'a';
        Character a2 = 'A';
        



    }

}
