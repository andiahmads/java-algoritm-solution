package com.company.algoritm_problem_solving.struktur_data;

import java.util.Scanner;

public class ReverseStringUsingStack {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan kata kata: ");
        String input = sc.nextLine();
        Stack myStack = new Stack(1000);


        //BUAT TEMPORARY VARIABEL
        int i = 0;

        //memecah string menajadi character
        for (char c : input.toCharArray()) {
            //lakukan push
            myStack.push("" + c);
            //c berisi string yang sudah dipecah menjadi character.
//            System.out.println(c);

            //misalkan kata yang diinput tersebut adalah itu
            // [i,t,u] -> convert ke stack, hasilnya [u,t,i]
            //karna element pada pada character lah yang menjadi index 0 pada sebuah stack
        }
        System.out.println("hasil reverse: ");

        while (!myStack.isEmpty()) {
            System.out.print(myStack.pop());
        }
        System.out.println();

    }
}
