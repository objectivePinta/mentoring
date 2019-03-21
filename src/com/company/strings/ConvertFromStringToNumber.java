package com.company.strings;

public class ConvertFromStringToNumber {

    public static void main(String[] args) {
        String numarCaString = "2.33";
        System.out.println(numarCaString + 9);
        float numarCaFloat = Float.valueOf(numarCaString).floatValue();
        System.out.println(numarCaFloat + 9);
        String stringDinNumar = String.valueOf(numarCaFloat);
        System.out.println(stringDinNumar + 9);
        int intreg = Integer.valueOf("23").intValue();
    }
}
