package com.company;

public class ArrayPlay {

    public static void main(String[] args) {
        int[] arr = {99, 8, 6, 33, 25, 16, 77, 81};
        int[] x = {1,2,3}; //length = 3
        int ultimaValoare = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

//        for (int i = 0; i < arr.length; i++) {
//            if (i == 0) {
//                ultimaValoare = arr[i];
//                continue;
//            }
//            System.out.println(ultimaValoare + " " + arr[i]);
//            ultimaValoare = arr[i];
//        }
    }
}
