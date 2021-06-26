package com.company.algoritm_problem_solving;


import org.junit.jupiter.api.Test;

public class FizzBuzz {

    public static void fizzBuzz(int total) {
        for (int i = 1; i < total; i++) {

            //cetak kata fizz setiap baris ke 3
            //menggunakan operator modula
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizz buzz ");
            } else if (i % 3 == 0) {
                System.out.println("fizz ");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }


    public static void main(String[] args) {
        fizzBuzz(100);
    }


}
