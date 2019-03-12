package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Buna dimineata!");
        int a;
        a = 23;
        double b;
        b = 5.6;
        boolean ninge = true;
        System.out.println("Ninge:" + ninge);
        System.out.printf("Ninge:%b", ninge);
        //citire de la tastatura
        Scanner scanner = new Scanner(System.in);
        int cititDeLaTastatura = scanner.nextInt();

        int contor = 5;
        while (contor > 0) {
            System.out.printf("Mai sunt %d ", contor);
            contor = contor - 1;
        }
        if (ninge) {
            System.out.println("Azi ninge");
        } else {
            System.out.println("Azi nu ninge");
        }

        for (int i = 0; i < 10; i++) {
            System.out.printf("i=%d", i);
        }

        switch (contor) {
            case 0:
                System.out.println("contorul este 0");
                break;
            case 1:
                System.out.println("contorul este 1");
                break;
            default:
                System.out.printf("contorul este %d", contor);

        }

        int[] array = new int[10];
        //incepe numaratul de indecsi de la 0
        //numarul dintre [] e numarul de elemente pe care vrei sa l aiba vectorul
//        array[0] = 4;
        System.out.printf("Lungimea la array este %d", array.length);
        System.out.println();
        for (int j = 0; j < array.length; j++) {
            System.out.println("array[" + j + "]=" + ":" + array[j]);
        }


    }

    static int suma(int a, int b) {
        return a + b;
    }

    static void afiseazaSuma(int a, int b) {
        System.out.println(a + b);
    }
}
