package com.company.algoritm_problem_solving.struktur_data;

public class Queue {
//
//    APA ITU QUEUE(ANTRIAN)
//    queue dapat dianalogikan seperti antrian loket, dimana orang yang pertama masuk antrian
//    akan menjadi orang yang pertama dilayani.
//    perbedaan: stack memiliki 1 pintu, sedangkan queue memiliki 2 pintu
//
//    Karakteristik queue adalah sistematika input dan output elementnya menggunakan sistematika FIFO(first in first out)
//    data yang pertamakali dimasukkan kedalam queue adalah data yang pertama kali keluar
//
//    Penggunaan queue
//    1. menyimpan langkah penelusuran graph menggunakan algoritm BFS, flood fill, brute force
//
//    Method2 pada queue
//    1.add() = push data kedalam queue
//    2.poll() = mengambil & membaca data dari queue
//    3.peek() = membaca data
//    4.getSize() = melihat size dari queue
//
//    Field pada queue
//    1.String[] data <- array untuk menyimpan antrian pada struktur data queue
//    2.int MAX <- banyaknya maksimal data yang dapat disimpan pada queue. MAX menyatakan panjang dari array
//    3. int size <- menyatakan banyaknya data yang tersimpan pada queue. size ini juga menyatakan banyaknya data,
//       yang tersimpan pada queue. size ini juga menyatakan panjang antrian. jika size <=0 itu berarti queue sedang dalam,
//       keadaan kosong. jika size == MAX itu berarti queue sedang dalam keadaan full.


//    IMPLEMENTASI CODE

    private String[] data;
    private int MAX;
    private int size;

    public Queue(int max) {
        MAX = max;
        data = new String[MAX];
        size = 0;
    }

    //        method add
//   1. jika size < MAX maka tambahkan value ke array data menggunakan operasi data[size]=value.
//   2. lakukan increment untuk field size menggunakan operasi size++.
    public boolean add(String value) {
        boolean result = false;
        if (size < MAX) {
            data[size] = value;
            size++;
            result = true;
        }
        return result;
    }


    //    method poll
//    1. jika size >0 maka set variable result = data[0]
//    2. lakukan penggeseran element data satu langkah ke depan dari index=1 sampai index=size-1
//    3. lakukan decrement pada variable size menggunakan operasi size--
//    4. kembalikan variable result sebagai output method poll()
    public String poll() {
        String result = null;
        if (size > 0) {
            result = data[0];
            //geser index
            for (int i = 1; i < size; i++) {
                data[i - 1] = data[i];
                size--;
            }
        }
        return result;
    }

    //    method peek
//    1. jika size > 0 maka set variable result = data[0]
//    2. kembalikan variable result sebagai output method peek()
    public String peek() {
        String result = null;
        if (size > 0) {
            result = data[0];
        }
        return result;
    }

//    method isEmpty
//    1. jika size <=0 maka return false
//    2. jika size >0 maka return true

    public boolean isEmpty() {
        boolean result = false;
        if (size <= 0) {
            result = true;
        }
        return result;
    }


    //    method isFUll
//    1. jika size >=MAX maka return true
//    2. Else return false
    public boolean isFull() {
        boolean result = false;
        if (size >= MAX) {
            result = true;
        }
        return result;
    }

    //method getSize
    public int getSize() {
        int result = size;
        return result;
    }

    public void cetak() {
        System.out.print("[");
        if (!isEmpty()) {
            for (int i = 0; i < getSize(); i++) {
                if (i > 0) {
                    System.out.print(" | ");
                }
                System.out.println(data[i]);
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Queue queue = new Queue(8);
        System.out.println("isEmpty: " + queue.isEmpty());
        System.out.println("isFull: " + queue.isFull());
        System.out.println("getSize: " + queue.getSize());

        boolean r1 = queue.add("java");
        System.out.println("result: " + r1);
        String r2 = queue.peek();
        System.out.println("result peek: " + 2);

        queue.add("php");
        queue.add("javascript");
        queue.add("python");
        queue.add("rust");
        queue.add("ruby");
        queue.add("perl");
        queue.add("typescript");
        queue.cetak();

        String r3 = queue.peek();
        System.out.println("result peek: " + r3);


        String r4 = queue.poll();
        System.out.println("result poll: " + r4);
        queue.cetak();


    }


}
