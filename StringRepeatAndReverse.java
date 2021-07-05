package com.company.algoritm_problem_solving;

public class StringRepeatAndReverse {

    public static void main(String[] args) {
        String cetak = displayMulti("oR", 2);
        System.out.println(cetak);


    }


    public static String displayMulti(String kata, int value) {
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