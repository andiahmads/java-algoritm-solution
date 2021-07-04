package com.company.algoritm_problem_solving;


//Diberikan bilangan array integer,
// kembalikan true jika ada nilai yang muncul setidaknya dua kali dalam array,
//dan kembalikan false jika setiap elemen berbeda.

//Example 1:
//
//Input: nums = [1,2,3,1]
//Output: true
//Example 2:
//
//Input: nums = [1,2,3,4]
//Output: false
//Example 3:
//
//Input: nums = [1,1,1,3,3,4,3,2,4,2]
//Output: true

import java.util.HashSet;

public class ContainDuplicate {
    public static void main(String[] args) {
        //inisialisasi dulu array tersebut
        int[] nums = new int[]{1, 3, 4, 5, 1};
        System.out.println(containsDuplicate(nums));


    }

    public static boolean containsDuplicate(int[] nums) {
        //disini kita gunakan hashSet
//        HashSet merupakan class yang sering digunakan untuk menyimpan collection yang bebas duplikasi.
//        Untuk efisiensi, objek yang ditambahkan dalam HashSet, perlu untuk menggunakan method hashCode().
        HashSet<Integer> numbers = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {

            //cek apakah didalam colection number yang diisi dengan array i, terdapat index yang sama
            // awalnya number itu array kosong [] lalu diisi dengan array num[i] yang bernilai [1,3,4,5,1]
            // maka number bernilai [1,3,4,5,1]
            if (numbers.contains(nums[i])) return true;
            numbers.add(nums[i]);
        }
        return false;
    }
}
