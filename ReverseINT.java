package com.company.algoritm_problem_solving;

public class ReverseINT {


    public static void main(String[] args) {


        System.out.println(reverse(120));

    }


    public static int reverse(int x) {

        int reverse = 0;

        // lakukan looping sampai x menjadi 0
        while(x !=0) {
            //ambil digit terkahir dari x
            int rumus = x % 10;
            reverse = reverse *10 + rumus;

            x /=10;
            if(reverse > Integer.MAX_VALUE || reverse == Integer.MAX_VALUE) {
                return 0;
            }
        }

        return reverse;



    }
}
