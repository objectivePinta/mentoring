package com.company.strings;

public class Palindrom {
    public static void main(String[] args) {
        String palindrome = "Ana are mere";
        String palindromeReplaced = palindrome.replace("a", "b");
        System.out.println("palindromeReplaced:" + palindromeReplaced);
        int len = palindrome.length();
        char[] tempCharArray = new char[len];
        char[] charArray = new char[len];

        // put original string in an
        // array of chars
        for (int i = 0; i < len; i++) {
            char x = palindrome.charAt(i);
            if (x == 'a')
                tempCharArray[i] = 'b';
            else {
                tempCharArray[i] = x;
            }

        }


        // reverse array of chars
        for (int j = 0; j < len; j++) {
            charArray[j] =
                    tempCharArray[len - 1 - j];
        }

        String reversePalindrome =
                new String(charArray);
        System.out.println(reversePalindrome);
        boolean estePalindrom = palindrome.equalsIgnoreCase(reversePalindrome);
        System.out.println("estePalindrom:" + estePalindrom);
        System.out.println(palindrome + " - " + reversePalindrome);
    }
}
