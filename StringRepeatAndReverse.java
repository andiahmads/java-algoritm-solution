package com.company.algoritm_problem_solving;

//
//Display three first letter of a given input string N times,
// but when the input is less then three, display in reverse.
//
//Example:
//
//displayMulti("Jakarta", 2) --> JakJak
//displayMulti("Jakarta", 3) --> JakJakJak
//displayMulti("BBM", 2) --> BBMBBM
//displayMulti("Or", 3) --> rOrOrO

public class StringRepeatAndReverse {

    public static void main(String[] args) {
        String cetak = displayMulti("oR", 3);
        System.out.println(cetak);


    }


    public static String displayMulti(String kata, int value) {
   // Class StringBuilder digunakan untuk membuat objek string yang mutable sama seperti class StringBuffer
   // terdapat 2 method yang bisa digunakan pada string builder
   // 1. append
   // 2. insert
   // dan harus menggunakan toString untuk mencetaknya
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < value; i++) {
            if (kata.length() < 3) {
                builder.reverse();
                System.out.print(kata.substring(0, 2));
            } else {
                builder.append(kata.substring(0, 3));
            }

        }
        return builder.toString();
    }
}
