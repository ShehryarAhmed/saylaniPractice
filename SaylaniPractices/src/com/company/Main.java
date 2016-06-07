package com.company;

public class Main {

    public static void main(String[] args) {
        String a = "a";
        String a2 =  new String(a);
        char array[] = {'H','E','l','l','o'};
        String a3 = new String(array, 0, 2);
        System.out.println(a3);
        System.out.println();
        String s1 = new String("HEllo");
        String s2 = new String(s1);
        String s3 = new String();
        char chararray[] = new char[5];
        for(int i = s1.length()-1; i>=0; i--){
            System.out.print(s1.charAt(i));
        }
        s1.getChars(0,5,chararray,0);
        System.out.println();
        System.out.println(chararray);
        for (char chara : chararray ) {
            System.out.println(chara);
        }
    }

}
