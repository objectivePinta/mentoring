package com.company.strings;

public class StringMethods {
    public static void main(String[] args) {
        String propozitie = "Ana are mere";
        String ana = propozitie.substring(0, 2);
        String are = propozitie.substring(4, 6);
        String mere = propozitie.substring(8, 11);
        String mere2 = propozitie.substring(8);

        //search
        boolean contineAna = propozitie.contains("Ana");

        //split
        String csv = "Ana,are,mere,si,pere,mari";
        String[] cuvinteleDinCsv = csv.split(",");
        String propozitiaMea = "";
        for (int i = 0; i < cuvinteleDinCsv.length; i++) {
            propozitiaMea = propozitiaMea + " " + cuvinteleDinCsv[i];
        }
        System.out.println(propozitiaMea);
        System.out.println(propozitiaMea.trim());
        System.out.println(propozitiaMea.toLowerCase());
        System.out.println(propozitiaMea.toUpperCase());
        int indexulLuiA = propozitiaMea.indexOf(97);
        System.out.println(indexulLuiA);
        System.out.println(propozitiaMea.lastIndexOf('a'));
        System.out.println(csv.replaceAll(","," "));
        System.out.println(csv.replaceAll(","," "));
        System.out.println(csv.indexOf("mere"));
        int n = 9;
        //missingChar
        System.out.println(csv.substring(0,n) + csv.substring(n+1));

    }
}
