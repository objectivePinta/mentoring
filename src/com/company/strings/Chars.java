package com.company.strings;

public class Chars {

    public static void main(String[] args) {
        String palindrome = "Ana are mere";
        int len = palindrome.length();
        char[] tempCharArray = new char[len];
        char[] tempCharArray2 = new char[4];
        palindrome.getChars(len - 2, len, tempCharArray2, 2);
        System.out.println(new String(tempCharArray2));
        //concat
        String stringA = "Ana are";
        String stringB = " mere.";
        System.out.println(stringA.concat(stringB));
        System.out.println(stringA + stringB);
        int x = 9;
        System.out.println("x = " + x);
        System.out.printf("x = %d", x);

    }
}
