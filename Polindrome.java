package com.company.algoritm_problem_solving;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Locale;

public class Polindrome {

    public boolean isPalindrome(String value) {
        String temp ="";
        for(int i = value.length()-1; i >= 0; i--) {
            temp  = temp+value.charAt(i);
        }
        System.out.println(temp);
        return temp.equals(value);
    }



    @Test
    void tesPalindrome() {
        Assertions.assertTrue(isPalindrome("afifa"));


    }

}
