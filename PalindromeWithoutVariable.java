package com.company.algoritm_problem_solving;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeWithoutVariable {


    public boolean isPalindrome(String value) {
        for (int i = 0; i < value.length() ; i++) {

            int indexAwal = i;
            int indexAkhir = (value.length() - 1 - i);

            //debuging dulu
//            System.out.println(i + " di compare dengan : " + (value.length() - 1 - i) );


            //lakukan comparasi
            if(value.charAt(indexAwal) != value.charAt(indexAkhir)){
                return false;
            }
        }
        return true;
    }


    @Test
    void Test() {
        Assertions.assertTrue(isPalindrome("kodok"));
//        isPalindrome("desy");

    }
}
