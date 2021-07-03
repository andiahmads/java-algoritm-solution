package com.company.algoritm_problem_solving.struktur_data;

public class Stack {

//    Stack dapat dianalogikan seperti tumpukan buku pada sebuah kotak
//    yang hanya memiliki satu sisi terbuka untuk memasukkan dan mengeluarkan
//     buku dari kotak tersebut

//
//    KARAKTERISTIK DARI STACK
//    sistematika input dan output elementnya menggunakan sistematika LIFO (last in First out)
//
//    data yang pertama kali dimasukkan kedalam stack menjadi data yang paling terakhir keluar
//
//
//    PENGGUNAAN STACK
//
//    1. menyimpan langkah penelurusan graph menggunakan algoritm DFS
//    2. membuat operasi reverse string
//    3. membuat operasi undo redo pada text processor
//
//
//    METHOD PADA STACK
//    1. push() = memasukkan data
//    2. pop() = mengeluarkan data
//    3. peek() = melihat data yang terakhir dikeluarkan
//    4. isEmpty = mengembalikan nilai boolean true/false
//    5. isFUll() = cek apakah stack dalam kondisi penuh atau tidak
//
//
//    FIELD PADA STACK
//    1. String[] data <- array untuk menyimpan tumpukkan pada struktur data stack
//    2. int MAX <- banyaknya maksimal data yang dapat disimpan pada stack. MAX menyatakan panjang atau size dari array
//    3. int top <- index dari data terakhir yang dimasukkan ke stack atau dapat dikatakan index/posisi data terluar/teratas
//        diarray data. Nilai top = -1 menyatakan stack sedang dalam keadaan kosong, sedangkan nilai top =MAX -1
//        menyatkan stack dalam keadaan full

//    IMPLEMENTASI CODE

    private String[] data;
    private int MAX;
    private int top;


    //buat constructor yang bertujuan untuk memberikan nilai awal untuk field yang ada didalam stack
    public Stack(int size) {
        MAX = size;
        data = new String[MAX];
        top = -1;
    }

    //untuk memasukkan data kedalam stack, maka gunakan method push()
//    1. lakukan incremant pada field top
//    2. jika top tidak sama dengan MAX set nilai data[top] = value
//    implementasi
    public boolean push(String value) {
        boolean result = false;
        top++;
        if (top < MAX) {
            data[top] = value;
            result = true;
        }
        else{
            top--;
        }
        return result;
    }

    //
//    MENGELUARKAN DATA DARI STACK DENGAN METHOD POP()
//    1. jika top >=0 maka set variable result = data[top]
//    2. lakukan decrement pada variable top
//    3. kembalikan variable result sebagai output method pop()
//    implementasi
    public String pop() {
        String result = null;
        if (top >= 0) {
            result = data[top];
            top--;
        }
        return result;
    }


//    MELIHAT DATA TERATAS DENGAN METHOD PEEK()
//    1. jika top <=0 maka set variable result= data[top]
//    2. kembalikan variable result sebagai outpu method peek()
//    implementasi
    public String peek() {
        String result = null;
        if (top >= 0) {
            result = data[top];
        }
        return result;
    }

//    MEMERIKSA STACK JIKA DALAM KEADAAN KOSONG isEmpty()
//    1. jika top < 0 maka return true
//    2. jika top >= 0 maka return false
//    implementasi

    public boolean isEmpty() {
        boolean result =false;
        if(top < 0) {
            result = true;
        }
        return result;
    }


//    MEMERIKSA APAKAH STACK FULL DENGAN METHOD isFull()
//    1. jika top > =MAX-1 maka return true
//    2. else return false
//    implementasi
    public boolean isFUll() {
        boolean result= false;
        if(top >=MAX-1) {
            result = true;
        }
        return result;
    }

    //melihat isi stack
    void cetak() {
        System.out.print("[ ");
        if(!isEmpty()) {
            for(int i = 0; i<=top; i++) {
                System.out.print(data[i]+", ");
            }
        }
                System.out.print(" ]");

    }

}
