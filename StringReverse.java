package com.company.algoritm_problem_solving;

import org.junit.jupiter.api.Test;

public class StringReverse {

    public void StringReverse(String txt){
        String data = "";
        for(int i = 0; i < txt.length(); i++) {
            String[] array = txt.split("");
            String array1 = array[i];
            data = array1+data;
        }
            System.out.println(data);

    }

    @Test
    void testStringReverse() {
        StringReverse("flaskdisk");
    }
}


