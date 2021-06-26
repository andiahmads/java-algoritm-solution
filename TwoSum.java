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


public class TwoSum {
    public static void main(String[] args) {

        int[] numbers = new int[] {2,3,7,4,8};
        int target = 7;
        System.out.println(twoSum(numbers,target));

    }

    public static int twoSum(int[] numbers, int target) {

        for(int i=0; i< numbers.length; i++) {
            System.out.println(i);
        }

        return target;
    }
}
