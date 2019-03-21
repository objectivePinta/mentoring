package com.company.strings;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String helloWorld = "Hello World";
        char caracter = 'x';
        char[] arrayDeChar = new char[]{'x'};
        String stringDinChar = new String(arrayDeChar);

        //lungimea unui string
        int lungime = helloWorld.length();
        //lungime la vector e vector.length, fara ()

        char charAt = helloWorld.charAt(4);
        System.out.println(charAt);

        //
        int[] arrayFaraValori = new int[9];
        int[] arrayInitializat = {1, 2, 3, 4};

    }
}
