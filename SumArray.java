package com.company.algoritm_problem_solving;

public class SumArray {
    public static void main(String[] args) {
        int[] arry = {1,2,3,1};

        //temporary variable
        int jumlahsementara = 0;

        for(int i=0; i< arry.length; i++) {
            System.out.println(jumlahsementara += arry[i]);

//            [0,0,0,0]
//            [1,2,3,1]
        }
        System.out.println("total array : "+jumlahsementara);


    }
}
