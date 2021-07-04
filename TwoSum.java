package com.company.algoritm_problem_solving;


//soal
//Diberikan array bilangan bulat nums dan target integer,
// kembalikan indeks dari dua angka sedemikian rupa sehingga mereka menambahkan hingga target.
//Anda dapat berasumsi bahwa setiap input akan memiliki tepat satu solusi,
// dan Anda tidak boleh menggunakan elemen yang sama dua kali.
//Anda dapat mengembalikan jawabannya dalam urutan apa pun.


//misalkan
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Output: Because nums[0] + nums[1] == 9, we return [0, 1].


import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        //definiskan arraynya dahulu
        int[] numbers = new int[] {2,3,4,5,6,7};
        int target = 7;
        System.out.println(getTwoSum(numbers,target));

    }

    public static int[] getTwoSum(int[] numbers,int target) {
        Map<Integer,Integer> visitedNumber = new HashMap<>();
        for(int i =0; i <numbers.length; i++) {
            int delta = target-numbers[i];
            if(visitedNumber.containsKey(delta)) {
                return new int[] {i, visitedNumber.get(delta)};
            }
                visitedNumber.put(numbers[i],i);
        }
        return new int[] {-1, -1};
    }


}
